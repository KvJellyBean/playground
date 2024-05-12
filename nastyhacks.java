// Kattis - nastyhacks

import java.util.Scanner;

public class nastyhacks {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int r = scan.nextInt();
            int e = scan.nextInt();
            int c = scan.nextInt();
            if(r+c < e) {
                System.out.println("advertise");
            } else if (r+c == e) {
                System.out.println("does not matter");
            } else {
                System.out.println("do not advertise");
            }
        }
    }
}
