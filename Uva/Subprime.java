package Uva;
// 11679
class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        java.util.Scanner sc = new java.util.Scanner(System.in);
        while (true) {
            int b = sc.nextInt();
            int n = sc.nextInt();
            if (b == 0 && n == 0) {
                break;
            }
            int[] r = new int[b];
            for (int i = 0; i < b; i++) {
                r[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                int d = sc.nextInt();
                int c = sc.nextInt();
                int v = sc.nextInt();
                r[d - 1] -= v;
                r[c - 1] += v;
            }
            boolean bailout = false;
            for (int i = 0; i < b; i++) {
                if (r[i] < 0) {
                    bailout = true;
                    break;
                }
            }
            System.out.println(bailout ? "N" : "S");
        }
    }
}
