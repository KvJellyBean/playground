// Kattis - leftbeehind

import java.util.Scanner;

public class leftbeehind {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            if (x+y == 13) {
                System.out.println("Never speak again.");
            } else if(x < y) {
                System.out.println("Left beehind.");
            } else if (x > y) {
                System.out.println("To the convention.");
            } else if (x == 0 && y == 0) {
                break;
            } else {
                System.out.println("Undecided.");
            }
        }
    }
}
