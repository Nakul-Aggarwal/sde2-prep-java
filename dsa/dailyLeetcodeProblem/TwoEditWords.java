package dsa.dailyLeetcodeProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 2452. Words Within Two Edits of Dictionary
 * You are given two string arrays, queries and dictionary. All words in each array comprise of lowercase English letters and have the same length.
 * 
 * In one edit you can take a word from queries, and change any letter in it to any other letter. Find all words from queries that, after a maximum of two edits, equal some word from dictionary.
 * 
 * Return a list of all words from queries, that match with some word from dictionary after a maximum of two edits. Return the words in the same order they appear in queries.
 * 
 * Example 1:
    * Input: queries = ["word","note","ants","wood"], dictionary = ["wood","joke","moat"]
    * Output: ["word","note","wood"]
    * Explanation:
        * Changing the 'r' in "word" to 'o' allows it to equal the dictionary word "wood".
        * Changing the 'n' to 'j' and the 't' to 'k' in "note" changes it to "joke".
        * It would take more than 2 edits for "ants" to equal a dictionary word.
        * "wood" can remain unchanged (0 edits) and match the corresponding dictionary word.
        * Thus, we return ["word","note","wood"].
 * Example 2:
 * 
    * Input: queries = ["yes"], dictionary = ["not"]
    * Output: []
    * Explanation:
        * Applying any two edits to "yes" cannot make it equal to "not". Thus, we return an empty array.
*/

public class TwoEditWords {

    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        
        List<String> result = new ArrayList<>();

        for(String query: queries) {
            for (String word: dictionary) {
                int diff = 0;

                for(int i=0; i<query.length(); i++) {
                    if (query.charAt(i) != word.charAt(i)) {
                        diff++;
                    }

                    if (diff > 2) {
                        break;
                    }
                }

                if (diff <= 2) {
                    result.add(query);
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String args[]) {

        TwoEditWords obj = new TwoEditWords();

        String[] queries1 = {"word","note","ants","wood"};
        String[] dictionary1 = {"wood","joke","moat"};

        System.out.println("Input 1");
        System.out.println("Query: " + Arrays.toString(queries1));
        System.out.println("Dictionary: " + Arrays.toString(dictionary1));

        List<String> result1 = obj.twoEditWords(queries1, dictionary1);
        System.out.println("Output: " + result1);

        System.out.println();
        System.out.println();

        String[] queries2 = {"yes"};
        String[] dictionary2 = {"not"};
        System.out.println("Input 2");
        System.out.println("Query: " + Arrays.toString(queries2));
        System.out.println("Dictionary: " + Arrays.toString(dictionary2));

        List<String> result2 = obj.twoEditWords(queries2, dictionary2);
        System.out.println("Output: " + result2);
    }
    
}
