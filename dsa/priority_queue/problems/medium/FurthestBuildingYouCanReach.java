public class FurthestBuildingYouCanReach {
    // TODO: Implement Furthest building you can reach
    // Problem: You are given an integer array heights representing the heights of buildings, some bricks, and some ladders.
    // You start your journey from building 0 and move to the next building by possibly using bricks or ladders.
    // While moving from building i to building i+1 (0-indexed),
    // - If heights[i+1] <= heights[i], no materials are needed.
    // - If heights[i+1] > heights[i], you must use either bricks or ladders. The number of bricks you need is heights[i+1] - heights[i].
    // - Each ladder can be used to jump over any number of buildings, but you can only use one ladder per jump.
    // Return the furthest building index (0-indexed) you can reach if you use the given ladders and bricks optimally.

    // Pseudo code:
    // - Max heap

    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        // TODO: Implement
        return 0;
    }
}