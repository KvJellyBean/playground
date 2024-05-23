package Uva;
// 11799
class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int T = scan.nextInt();
        for (int i = 1; i <= T; i++) {
            int N = scan.nextInt();
            int max = 0;
            for (int j = 0; j < N; j++) {
                int speed = scan.nextInt();
                if (speed > max) {
                    max = speed;
                }
            }
            System.out.println("Case " + i + ": " + max);
        }
    }
}
