package Uva;
// 1585
class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            int score = 0;
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'O') {
                    count++;
                    score += count;
                } else {
                    count = 0;
                }
            }
            System.out.println(score);
        }
    }
}
