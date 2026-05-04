import java.util.*;

/*
 * 904. Fruit Into Baskets
 * You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.
 * 
 * You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:
 * 
 * You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
 * Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right. The picked fruits must fit in one of your baskets.
 * 
 * Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
 * Given the integer array fruits, return the maximum number of fruits you can pick.
 * 
 * Example 1:
    * Input: fruits = [1,2,1]
    * Output: 3
    * Explanation: We can pick from all 3 trees.
 *
 * Example 2:
    * Input: fruits = [0,1,2,2]
    * Output: 3
    * Explanation: We can pick from trees [1,2,2].
    * If we had started at the first tree, we would only pick from trees [0,1].
 *
 * Example 3:
    * Input: fruits = [1,2,3,2,2]
    * Output: 4
    * Explanation: We can pick from trees [2,3,2,2].
    * If we had started at the first tree, we would only pick from trees [1,2].
 *  
 * Question link: https://leetcode.com/problems/fruit-into-baskets/description/
 */

public class FruitIntoBaskets {

    public int totalFruit(int[] fruits) {
        int maxFruits = 0;
        HashMap<Integer, Integer> fruitMap = new HashMap<>();

        int left = 0;
        for(int right = 0; right < fruits.length; right++) {
            fruitMap.put(fruits[right], fruitMap.getOrDefault(fruits[right], 0)+1);

            while(fruitMap.size()>2) {
                fruitMap.put(fruits[left], fruitMap.get(fruits[left])-1);
                if(fruitMap.get(fruits[left]) <= 0) {
                    fruitMap.remove(fruits[left]);
                }
                left++;
            }

            maxFruits = Math.max(maxFruits, right-left+1);
        }

        return maxFruits;
    }

    public static void main(String args[]) {

        FruitIntoBaskets obj = new FruitIntoBaskets();

        //Example 1
        int[] fruits1 = {1,2,1};
        int result1 = obj.totalFruit(fruits1);
        System.out.println("Example 1:");
        System.out.println("Input: " + Arrays.toString(fruits1));
        System.out.println("Output: " + result1);
        System.out.println();
        System.out.println();

        //Example 2
        int[] fruits2 = {0,1,2,2};
        int result2 = obj.totalFruit(fruits2);
        System.out.println("Example 2:");
        System.out.println("Input: " + Arrays.toString(fruits2));
        System.out.println("Output: " + result2);
        System.out.println();
        System.out.println();

        //Example 3
        int[] fruits3 = {1,2,3,2,2};
        int result3 = obj.totalFruit(fruits3);
        System.out.println("Example 3:");
        System.out.println("Input: " + Arrays.toString(fruits3));
        System.out.println("Output: " + result3);
    }
}