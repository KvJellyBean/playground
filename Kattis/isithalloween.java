// Kattis - isithalloween

import java.util.Scanner;

public class isithalloween {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        String theDate = scan.nextLine();
        if(theDate.toUpperCase().equals("OCT 31")  || theDate.toUpperCase().equals("DEC 25")){
            System.out.println("yup");
        } else {
            System.out.println("nope");
        }
    }
}
