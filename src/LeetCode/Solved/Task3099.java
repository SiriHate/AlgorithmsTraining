package LeetCode.Solved;

public class Task3099 {
    public static int sumOfTheDigitsOfHarshadNumber(int x) {

        int targetNum = x;

        int sumOfDigits = 0;

        while (x > 0) {
            sumOfDigits += x % 10;
            x /= 10;
        }

        if (targetNum % sumOfDigits == 0) {
            return sumOfDigits;
        } else {
            return -1;
        }
    }
}
