// Kattis - faktor

import java.util.Scanner;

public class faktor {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int I = scan.nextInt();
        System.out.println((A*(I-1)) + 1);
    }
}