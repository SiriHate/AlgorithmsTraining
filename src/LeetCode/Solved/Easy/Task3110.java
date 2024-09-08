package LeetCode.Solved.Easy;

public class Task3110 {

    public static int scoreOfString(String s) {

        char[] characters = s.toCharArray();

        int currentCharacterCode = characters[0];

        int sum = 0;

        for (int i = 1; i < characters.length; i++) {
            int nextCharacterCode = characters[i];
            sum += Math.abs(nextCharacterCode - currentCharacterCode);
            currentCharacterCode = nextCharacterCode;
        }

        return sum;
    }

}
