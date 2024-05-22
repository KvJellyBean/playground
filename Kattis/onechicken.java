// Kattis - onechicken

import java.util.Scanner;

public class onechicken {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int P ;
        if(N < M) {
            P = M-N;
            if(P == 1){
                System.out.println("Dr. Chaz will have " + P + " piece of chicken left over!");
                return;
            } else {
                System.out.println("Dr. Chaz will have " + P + " pieces of chicken left over!");
                return;
            }
        } else {
            P = N-M;
            if(P == 1){
                System.out.println("Dr. Chaz needs " + P + " more piece of chicken!");
            } else {
                System.out.println("Dr. Chaz needs " + P + " more pieces of chicken!");
            }
        }
    }
}
