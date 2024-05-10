// Kattis - judgingmoose

import java.util.Scanner;

public class judgingmoose {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int r = scan.nextInt();
        if( l == 0 && r == 0 ) {
            System.out.println("Not a moose");
            return;
        }
        if(l == r){
            System.out.println("Even " + (l+r));
            return;
        } else {
            if(l > r){
                System.out.println("Odd " + (l*2));
                return;
            } else {
                System.out.println("Odd " + (r*2));
                return;
            }
        }
    }
}
