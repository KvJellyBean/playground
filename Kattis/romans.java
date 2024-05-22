// Kattis - romans

import java.text.DecimalFormat;
import java.util.Scanner;

public class romans {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        double X = scan.nextDouble();
        String Xnew = new DecimalFormat("#.###").format(X);
        X = Double.parseDouble(Xnew);
        System.out.println(Math.round(X * 1000*5280/4854));
    }
}
