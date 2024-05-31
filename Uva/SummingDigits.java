package Uva;
class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            System.out.println((n - 1) % 9 + 1);
        }
        scanner.close();
    }
}