package Uva;
// 11078
class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int maxDifference = Integer.MIN_VALUE;
            int maxScore = sc.nextInt();
            
            for (int j = 1; j < n; j++) {
                int score = sc.nextInt();
                int difference = maxScore - score;
                if (difference > maxDifference) {
                    maxDifference = difference;
                }
                if (score > maxScore) {
                    maxScore = score;
                }
            }
            
            if (maxDifference == Integer.MIN_VALUE) {
                maxDifference = -1;
            }
            
            System.out.println(maxDifference);
        }
    }
}
