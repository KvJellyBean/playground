// Kattis - temperature

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        Double X = scan.nextDouble();
        Double Y = scan.nextDouble();
        Y--;
        if(Y < .5){
            if(X == 0) {
                System.out.println("ALL GOOD");
            } else {
                System.out.println("IMPOSSIBLE");
            }
        } else {
            System.out.println(-(X/Y));
        }
    }
}
