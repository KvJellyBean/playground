// Kattis - qaly

import java.util.Scanner;

public class qaly {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        double qaly = 0;
        int N = scan.nextInt();
        for (int i = 0; i < N; i++) {
            double q = scan.nextDouble();
            double y = scan.nextDouble();
            qaly += (q*y);
        }
        System.out.println(qaly);
    }
}
