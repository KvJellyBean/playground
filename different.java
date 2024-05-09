// Kattis - different

import java.util.Scanner;

public class different {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            long i = scan.nextLong();
            long j = scan.nextLong();
            if(i > j)
                System.out.println(i-j);
            else 
                System.out.println(j-i);
        }
    }
}
