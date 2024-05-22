package Uva;
// 11044
class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            System.out.println((n / 3) * (m / 3));
        }
    }    
}
