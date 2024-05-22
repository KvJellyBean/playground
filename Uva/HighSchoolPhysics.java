package Uva;
// 10071
class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        java.util.Scanner scan = new java.util.Scanner(System.in);
        while (scan.hasNext()) {
            int v = scan.nextInt();
            int t = scan.nextInt();
            System.out.println(2 * v * t);
        }

    }
}
