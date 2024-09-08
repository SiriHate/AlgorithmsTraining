package LeetCode.Solved.Easy;

import java.util.List;

public class Task3248 {
    public static int finalPositionOfSnake(int n, List<String> commands) {

        int currentX = 0;
        int currentY = 0;

        for (String command : commands) {
            switch (command) {
                case "UP": currentY = currentY - 1; break;
                case "DOWN": currentY = currentY + 1; break;
                case "LEFT": currentX = currentX - 1; break;
                case "RIGHT": currentX = currentX + 1; break;
            }
        }

        return currentY * 3 + currentX;
    }
}
