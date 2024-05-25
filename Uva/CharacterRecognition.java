package Uva;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        scanner.nextLine(); // consume the rest of the line

        String[] input = new String[5];
        for (int i = 0; i < 5; i++) {
            input[i] = scanner.nextLine();
        }

        StringBuilder result = new StringBuilder();

        String[] DIGIT_1 = {
            ".*.",
            ".*.",
            ".*.",
            ".*.",
            ".*."
        };

        String[] DIGIT_2 = {
            "***",
            "..*",
            "***",
            "*..",
            "***"
        };

        String[] DIGIT_3 = {
            "***",
            "..*",
            "***",
            "..*",
            "***"
        };

        for (int i = 0; i < n; i++) {
            int startColumn = i * 4;
            boolean isMatched = true;
            for (int k = 0; k < 5; k++) {
                for (int j = 0; j < 3; j++) {
                    if (input[k].charAt(startColumn + j) != DIGIT_1[k].charAt(j)) {
                        isMatched = false;
                        break;
                    }
                }
                if (!isMatched) break;
            }
            if (isMatched) {
                result.append('1');
                continue;
            }

            isMatched = true;
            for (int k = 0; k < 5; k++) {
                for (int j = 0; j < 3; j++) {
                    if (input[k].charAt(startColumn + j) != DIGIT_2[k].charAt(j)) {
                        isMatched = false;
                        break;
                    }
                }
                if (!isMatched) break;
            }
            if (isMatched) {
                result.append('2');
                continue;
            }

            isMatched = true;
            for (int k = 0; k < 5; k++) {
                for (int j = 0; j < 3; j++) {
                    if (input[k].charAt(startColumn + j) != DIGIT_3[k].charAt(j)) {
                        isMatched = false;
                        break;
                    }
                }
                if (!isMatched) break;
            }
            if (isMatched) {
                result.append('3');
            }
        }

        System.out.println(result.toString());
    }
}
