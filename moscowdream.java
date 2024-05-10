// Kattis - moscowdream

import java.util.Scanner;

public class moscowdream {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int n = scan.nextInt();

        if(a < 1 || b < 1 || c < 1) {
            System.out.println("NO");
            return;
        } else if(a+b+c < n || n < 3){
            System.out.println("NO");
            return;
        } else {
            System.out.println("YES");
            return;
        }
    }
}
