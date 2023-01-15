package by.mark.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/">3. Longest Substring Without Repeating Characters</a>
 */
class Solution3 {

    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) {
            return s.length();
        }

        int maxLength = 0;
        int latestCharToMeasure = 0;
        Map<Character, Integer> char2Position = new HashMap<>();

        for (int currentCharPosition = 0; currentCharPosition < s.length(); currentCharPosition++) {
            char c = s.charAt(currentCharPosition);

            Integer previousCharPosition = char2Position.get(c);

            if (previousCharPosition != null) {
                latestCharToMeasure = Math.max(latestCharToMeasure, previousCharPosition + 1);
            }

            int currentLength = currentCharPosition + 1;
            maxLength = Math.max(maxLength, currentLength - latestCharToMeasure);
            char2Position.put(c, currentCharPosition);
        }

        return maxLength;
    }
}
