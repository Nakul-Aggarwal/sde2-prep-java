public class NumberOfWaysToArriveAtDestination {
    // TODO: Implement Number of ways to arrive at destination
    // Problem: You are in a city that consists of n intersections numbered from 0 to n - 1 with bi-directional roads between some intersections. The inputs are generated such that you can reach any intersection from any other intersection and that there is at most one road between any two intersections.
    // You are given an integer n and a 2D integer array roads where roads[i] = [ui, vi, timei] means that there is a road between intersections ui and vi that takes timei minutes to travel. You want to know, for each intersection, the number of ways you can reach it from intersection 0 in exactly T minutes, where T is the minimum time to reach that intersection from 0.
    // Return an array ways of length n where ways[i] is the number of ways you can reach intersection i from intersection 0 in exactly T minutes, where T is the minimum time to reach intersection i from 0. Since the number can be large, return it modulo 10^9 + 7.

    // Pseudo code:
    // - Dijkstra with count

    public int countPaths(int n, int[][] roads) {
        // TODO: Implement
        return 0;
    }
}