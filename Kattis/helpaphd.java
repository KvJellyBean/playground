// Kattis - helpaphd

import java.util.Scanner;

public class helpaphd {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for (int i = 0; i < N; i++) {
            String question = scan.next();
            if(question.toUpperCase().equals("P=NP")){
                System.out.println("skipped");
            } else {
                String[] a = question.split("\\+");
                System.out.println(Integer.parseInt(a[0]) + Integer.parseInt(a[1]));
            }
        }
    }
}
