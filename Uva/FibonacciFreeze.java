package Uva;
// 495
import java.math.BigInteger;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger[] fib = new BigInteger[5001];
        fib[0] = BigInteger.ZERO;
        fib[1] = BigInteger.ONE;
        for (int i = 2; i <= 5000; i++) {
            fib[i] = fib[i - 1].add(fib[i - 2]);
        }
        while (scan.hasNextInt()) {
            int n = scan.nextInt();
            System.out.println("The Fibonacci number for " + n + " is " + fib[n]);
        }
        scan.close();
    }
}