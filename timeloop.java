// Kattis - timeloop 

import java.util.Scanner;

public class timeloop {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println(i + " Abracadabra");
        }
    }
}
