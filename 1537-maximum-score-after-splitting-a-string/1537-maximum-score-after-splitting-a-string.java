public class Solution {
    public int maxScore(String inputStr) {
        int t = 0,z = 0,o = 0;
        int bestScore = Integer.MIN_VALUE;

        for (char ch : inputStr.toCharArray()) {
            if (ch == '1') t++;
        }

        for (int i = 0; i < inputStr.length() - 1; i++) {
            if (inputStr.charAt(i) == '0') z++;
            else o++;

            int c = z + (t - o);
            bestScore = Math.max(bestScore, c);

        }

        return bestScore;
    }
}