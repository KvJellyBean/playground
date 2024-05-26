package Uva;
// 11559
class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int b = scanner.nextInt();
            int h = scanner.nextInt();
            int w = scanner.nextInt();
            
            int minCost = Integer.MAX_VALUE;
            for (int i = 0; i < h; i++) {
                int p = scanner.nextInt();
                for (int j = 0; j < w; j++) {
                    int a = scanner.nextInt();
                    if (a >= n) {
                        int cost = n * p;
                        if (cost < minCost) {
                            minCost = cost;
                        }
                    }
                }
            }
            
            if (minCost <= b) {
                System.out.println(minCost);
            } else {
                System.out.println("stay home");
            }
        }
    }
}
