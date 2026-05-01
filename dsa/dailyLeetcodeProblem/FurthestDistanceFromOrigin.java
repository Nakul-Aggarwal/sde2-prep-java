package dsa.dailyLeetcodeProblem;

/*
 * 2833. Furthest Point From Origin 
 * You are given a string moves of length n consisting only of characters 'L', 'R', and '_'. The string represents your movement on a number line starting from the origin 0.
 * In the ith move, you can choose one of the following directions:
    * move to the left if moves[i] = 'L' or moves[i] = '_'
    * move to the right if moves[i] = 'R' or moves[i] = '_'

 * Return the distance from the origin of the furthest point you can get to after n moves.

 * Example 1:
    * Input: moves = "L_RL__R"
    * Output: 3
    * Explanation: The furthest point we can reach from the origin 0 is point -3 through the following sequence of moves "LLRLLLR".

 * Example 2:
    * Input: moves = "_R__LL_"
    * Output: 5
    * Explanation: The furthest point we can reach from the origin 0 is point -5 through the following sequence of moves "LRLLLLL".

 * Example 3:
    * Input: moves = "_______"
    * Output: 7
    * Explanation: The furthest point we can reach from the origin 0 is point 7 through the following sequence of moves "RRRRRRR".
     
 * https://leetcode.com/problems/furthest-point-from-origin/?envType=daily-question&envId=2026-04-27
 */


public class FurthestDistanceFromOrigin {
    
    public int furthestDistanceFromOrigin(String moves) {   
        int distance = 0;
        int blankCount = 0;

        for(int i=0; i< moves.length(); i++) {
            char ch = moves.charAt(i);

            if (ch == 'L') {
                distance--;
            } else if (ch == 'R') {
                distance++;
            } else {
                blankCount++;
            }
        }

        return Math.abs(distance) + blankCount;
    }

    public static void main(String[] args) {
        FurthestDistanceFromOrigin obj = new FurthestDistanceFromOrigin();

        String moves1 = "L_RL__R";
        int result1 = obj.furthestDistanceFromOrigin(moves1);
        System.out.println("Example 1:");
        System.out.println("String: " + moves1);
        System.out.println("Result: " + result1);

        String moves2 = "_R__LL_";
        int result2 = obj.furthestDistanceFromOrigin(moves2);
        System.out.println("Example 2:");
        System.out.println("String: " + moves2);
        System.out.println("Result: " + result2);

        String moves3 = "_______";
        int result3 = obj.furthestDistanceFromOrigin(moves3);
        System.out.println("Example 3:");
        System.out.println("String: " + moves3);
        System.out.println("Result: " + result3);
    }
}
