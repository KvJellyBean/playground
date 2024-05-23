package Uva;
//10424
class Main {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        while (scan.hasNext()) {
            String s1 = scan.nextLine();
            String s2 = scan.nextLine();
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < s1.length(); i++) {
                char c = s1.charAt(i);
                if (Character.isLetter(c)) {
                    sum1 += Character.toLowerCase(c) - 'a' + 1;
                }
            }
            for (int i = 0; i < s2.length(); i++) {
                char c = s2.charAt(i);
                if (Character.isLetter(c)) {
                    sum2 += Character.toLowerCase(c) - 'a' + 1;
                }
            }
            while (sum1 > 9) {
                int temp = 0;
                while (sum1 > 0) {
                    temp += sum1 % 10;
                    sum1 /= 10;
                }
                sum1 = temp;
            }
            while (sum2 > 9) {
                int temp = 0;
                while (sum2 > 0) {
                    temp += sum2 % 10;
                    sum2 /= 10;
                }
                sum2 = temp;
            }
            double result = (double) Math.min(sum1, sum2) / Math.max(sum1, sum2) * 100;
            System.out.printf("%.2f %%\n", result);
        }
    }
}
