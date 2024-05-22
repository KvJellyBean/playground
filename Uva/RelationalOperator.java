package Uva;
// 11172
class Main {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            if (a > b) {
                System.out.println(">");
            } else if (a < b) {
                System.out.println("<");
            } else {
                System.out.println("=");
            }
        }
    }
}
