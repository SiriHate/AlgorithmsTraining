package LeetCode.Solved.Easy;

public class Task3174 {
    public static String clearDigits(String s) {

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                answer.append(s.charAt(i));
            } else {
               if (i > 0) {
                   for (int j = answer.length() - 1; j >= 0; j--) {
                       if (!Character.isDigit(answer.charAt(j))) {
                           answer.deleteCharAt(j);
                           break;
                       }
                   }
               }
            }
        }

        return answer.toString();
    }
}
