import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1002. Find Common Characters
 *
 * Given a string array words, return an array of all characters that show up in all strings within the words (including duplicates). You may return the answer in any order.
 *
 * Example 1:
 * Input: words = ["bella","label","roller"]
 * Output: ["e","l","l"]
 *
 * Example 2:
 * Input: words = ["cool","lock","cook"]
 * Output: ["c","o"]
 *
 * https://leetcode.com/problems/find-common-characters/description/
 */
public class FindCommonCharacters {

    public List<String> commonChars(String[] words) {

        int[] minFrequency = new int[26];

        for(char ch: words[0].toCharArray()) {
            minFrequency[ch - 'a']++;
        }

        for(int i=0; i<words.length; i++) {

            // calculate frequency for each word
            int[] tempFreq = new int[26];
            for(char ch: words[i].toCharArray()) {
                tempFreq[ch - 'a']++;
            }

            // store the minimum frequency
            for (int j=0; j<26; j++) {
                minFrequency[j] = Math.min(minFrequency[j], tempFreq[j]);
            }
        }

        // Create result array
        List<String> result = new ArrayList<>();
        for(int i=0; i<26; i++) {
            while(minFrequency[i]-- > 0) {
                result.add(String.valueOf((char) (i + 'a')));
            }
        }

        return result;
    }

    public static void main(String args[]) {
        FindCommonCharacters obj = new FindCommonCharacters();

        // Example 1
        String[] words1 = {"bella","label","roller"};
        List<String> result1 = obj.commonChars(words1);
        System.out.println("Example 1:");
        System.out.println("Words: " + Arrays.toString(words1));
        System.out.println("Common Characters: " + result1);

        System.out.println();
        System.out.println();

        //Example2
        String[] words2 = {"cool","lock","cook"};
        List<String> result2 = obj.commonChars(words2);
        System.out.println("Example 2");
        System.out.println("Words: " + Arrays.toString(words2));
        System.out.println("Common Characters: " + result2);
    }

}