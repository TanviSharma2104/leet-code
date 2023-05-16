class Solution {
    public int lengthOfLongestSubstring(String A) {
        int maxLength = 0;
        int[] charIndex = new int[256]; // Assuming ASCII characters

        Arrays.fill(charIndex, -1); // Initialize all characters' last index as -1
        int start = 0;

        for (int end = 0; end < A.length(); end++) {
            char ch = A.charAt(end);
            int chIndex = charIndex[ch];

            // If the character is seen before and its last occurrence is after the start index,
            // update the start index to the next position of its last occurrence
            if (chIndex != -1 && chIndex >= start) {
                start = chIndex + 1;
            }

            charIndex[ch] = end; // Update the last index of the character
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}
