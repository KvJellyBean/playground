package Uva;
// 1316
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n == 0) {
                System.out.println(0);
                continue;
            }
            Product[] products = new Product[n];
            for (int i = 0; i < n; i++) {
                int profit = scanner.nextInt();
                int deadline = scanner.nextInt();
                products[i] = new Product(profit, deadline);
            }
            Arrays.sort(products, (p1, p2) -> p2.profit - p1.profit);
            boolean[] slots = new boolean[10001];
            int maxProfit = 0;
            for (Product product : products) {
                for (int j = Math.min(10000, product.deadline); j > 0; j--) {
                    if (!slots[j]) {
                        slots[j] = true;
                        maxProfit += product.profit;
                        break;
                    }
                }
            }
            System.out.println(maxProfit);
        }
        scanner.close();
    }

    static class Product {
        int profit;
        int deadline;

        Product(int profit, int deadline) {
            this.profit = profit;
            this.deadline = deadline;
        }
    }
}
