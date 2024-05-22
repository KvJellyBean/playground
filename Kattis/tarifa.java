// Kattis - tarifa

import java.util.Scanner;

public class tarifa {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        int N = scan.nextInt();
        int total = 0;
        for (int i = 0; i < N; i++) {
            int Pi = scan.nextInt();
            total += X - Pi;
        }
        System.out.println(total+X);
    }
}
