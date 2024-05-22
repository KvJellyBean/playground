// Kattis - eligibility

import java.util.Scanner;

public class eligibility {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        for (int i = 0; i < x; i++) {
            String name = scan.next();
            int began = Integer.parseInt(scan.next().substring(0,4));
            int birth = Integer.parseInt(scan.next().substring(0,4));
            int courses = scan.nextInt();
            if(began >= 2010) {
                System.out.println(name + " eligible");
                continue;
            } 
            if (birth >= 1991) {
                System.out.println(name + " eligible");
                continue;
            } 
            if (courses > 40) {
                System.out.println(name + " ineligible");
                continue;
            } else {
                System.out.println(name + " coach petitions");
                continue;
            }
        }
    }
}
