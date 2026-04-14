package dsa.dailyLeetcodeProblem;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Problem: 2463. Minimum Total Distance Traveled
 * Link: https://leetcode.com/problems/minimum-total-distance-traveled/?envType=daily-question&envId=2026-04-14
 *
 * There are some robots and factories on the X-axis. You are given an integer array robot
 * where robot[i] is the position of the ith robot. You are also given a 2D integer array
 * factory where factory[j] = [positionj, limitj] indicates that positionj is the position of
 * the jth factory and that the jth factory can repair at most limitj robots.
 *
 * The positions of each robot are unique. The positions of each factory are also unique.
 * Note that a robot can be in the same position as a factory initially.
 *
 * All the robots are initially broken; they keep moving in one direction. The direction could
 * be the negative or the positive direction of the X-axis. When a robot reaches a factory that
 * did not reach its limit, the factory repairs the robot, and it stops moving.
 *
 * At any moment, you can set the initial direction of moving for some robot. Your target is to
 * minimize the total distance traveled by all the robots.
 *
 * Return the minimum total distance traveled by all the robots. The test cases are generated such
 * that all the robots can be repaired.
 *
 * Note that:
 * - All robots move at the same speed.
 * - If two robots move in the same direction, they will never collide.
 * - If two robots move in opposite directions and they meet at some point, they do not collide.
 *   They cross each other.
 * - If a robot passes by a factory that reached its limits, it crosses it as if it does not exist.
 * - If the robot moved from a position x to a position y, the distance it moved is |y - x|.
 */

public class MinimumTotalDistanceTraveled {

    public long solutionUsingDP(List<Integer> robot, List<Integer> factory, int robotIndex, int factoryIndex, Long[][] dp) {
        
        if (robotIndex >= robot.size()) {
            return 0;
        }

        if (factoryIndex >= factory.size()) {
            return Integer.MAX_VALUE;
        }

        if (dp[robotIndex][factoryIndex] == null) {
            long takeCurrentFactory = Math.abs(factory.get(factoryIndex) - robot.get(robotIndex)) + solutionUsingDP(robot, factory, robotIndex+1, factoryIndex+1, dp);
            long skipCurrentFactory = solutionUsingDP(robot, factory, robotIndex, factoryIndex+1, dp);

            return dp[robotIndex][factoryIndex] = Math.min(takeCurrentFactory, skipCurrentFactory);
        }

        return dp[robotIndex][factoryIndex];
    }

    public long solutionUsingRecursion(List<Integer> robot, List<Integer> factory, int robotIndex, int factoryIndex) {

        if (robotIndex >= robot.size()) {
            return 0;
        }

        if (factoryIndex >= factory.size()) {
            return Integer.MAX_VALUE;
        }

        long takeCurrentFactory = Math.abs(factory.get(factoryIndex) - robot.get(robotIndex)) + solutionUsingRecursion(robot, factory, robotIndex+1, factoryIndex+1);
        long skipCurrentFactory = solutionUsingRecursion(robot, factory, robotIndex, factoryIndex+1);

        return Math.min(takeCurrentFactory, skipCurrentFactory);
    }

    public long minimumTotalDistance(List<Integer> robot, int[][] factory) {
        
        // Step-1: Sort both the arrays
        Collections.sort(robot);
        Arrays.sort(factory, (a, b) -> Integer.compare(a[0], b[0]));

        // Step-2: Create factoryPositions list with factory is repeated according to its limit
        List<Integer> factoryPositions = new ArrayList<>();

        for(int i=0; i< factory.length; i++) {
            int position = factory[i][0];
            int limit = factory[i][1];

            for(int j=0; j<limit; j++) {
                factoryPositions.add(position);
            }
        }

        // Step-3: Calculate minimum total distance

        // Using recursion

        // return solutionUsingRecursion(robot, factoryPositions, 0, 0);

        // Using recursion with memoization

        Long[][] dp = new Long[robot.size()][factoryPositions.size()];
        return solutionUsingDP(robot, factoryPositions, 0, 0, dp);
    }

    public static void main(String args[]) {
        List<Integer> robot = Arrays.asList(0,4,6);
        int[][] factory = new int[][]{{2,2},{6,2}};

        MinimumTotalDistanceTraveled solver = new MinimumTotalDistanceTraveled();
        long result = solver.minimumTotalDistance(robot, factory);
        System.out.println("Minimum total distance: " + result);
    }
    
}
