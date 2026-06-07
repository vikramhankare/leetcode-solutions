// Last updated: 6/7/2026, 6:29:13 PM
class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String vowels = "aeiou";

        int firstCount = 0;
        for (char c : words[0].toCharArray()) {
            if (vowels.indexOf(c) != -1) firstCount++;
        }

        for (int i = 1; i < words.length; i++) {
            int cnt = 0;
            for (char c : words[i].toCharArray()) {
                if (vowels.indexOf(c) != -1) cnt++;
            }
            if (cnt == firstCount) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }

        return String.join(" ", words);
    }
}