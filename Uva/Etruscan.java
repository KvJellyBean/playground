package Uva;
// 11614
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        for (int i = 0; i < x; i++) {
            long n = scan.nextLong();
            long rows = (long) Math.floor((-1 + Math.sqrt(1 + 8 * n)) / 2);
            System.out.println(rows);
        }
        
    }
}
