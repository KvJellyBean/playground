// Kattis - numberfun

import java.util.Scanner;

public class numberfun {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for (int i = 0; i < N; i++) {
            Double a = scan.nextDouble();
            Double b = scan.nextDouble();
            double c = scan.nextDouble();

            if(a+b == c || a-b == c || b-a == c || a*b == c || a/b == c || b/a == c){
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }
        }
    }
}
