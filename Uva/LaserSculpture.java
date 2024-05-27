package Uva;

// 11683
class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        while (true) {
            int A = scanner.nextInt();
            int C = scanner.nextInt();
            if (A == 0 && C == 0) {
                break;
            }
            int laserOnCount = 0;
            int currentHeight = A;
            for (int i = 0; i < C; i++) {
                int targetHeight = scanner.nextInt();
                if (targetHeight < currentHeight) {
                    laserOnCount += (currentHeight - targetHeight);
                }
                currentHeight = targetHeight;
            }
            System.out.println(laserOnCount);
        }
        scanner.close();
    }
}
