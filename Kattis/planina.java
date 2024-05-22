// Kattis - planina

import java.util.Scanner;

public class planina {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        System.out.println((int) Math.pow(Math.pow(2, N) + 1, 2));
    }
}
