public class CountNumberOfTeams {
    // TODO: Implement Count number of teams
    // Problem: There are n soldiers standing in a line. Each soldier is assigned a unique rating value.
    // You have to form a team of 3 soldiers amongst them under the following rules:
    // Choose 3 soldiers with index (i, j, k) with i < j < k, such that rating[i] < rating[j] < rating[k] or rating[i] > rating[j] > rating[k].
    // Return the number of teams you can form given the conditions.

    // Pseudo code:
    // - For each middle soldier j, count left smaller and larger, right smaller and larger
    // - For increasing: left_smaller * right_larger
    // - For decreasing: left_larger * right_smaller

    public int numTeams(int[] rating) {
        // TODO: Implement
        return 0;
    }
}