// Kattis - oddities

import java.util.Scanner;

public class oddities {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n > 0) {
            int x = scan.nextInt();
            System.out.println(x + " is " + ((x%2 == 0) ? "even" : "odd"));
            n--;
        }
    }
}