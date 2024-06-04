package Uva;
// 11764
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int i = 1; i <= T; i++) {
            int N = scan.nextInt();
            int[] walls = new int[N];
            for (int j = 0; j < N; j++) {
                walls[j] = scan.nextInt();
            }
            int highJumps = 0;
            int lowJumps = 0;
            for (int j = 0; j < N - 1; j++) {
                if (walls[j] < walls[j + 1]) {
                    highJumps++;
                } else if (walls[j] > walls[j + 1]) {
                    lowJumps++;
                }
            }
            System.out.println("Case " + i + ": " + highJumps + " " + lowJumps);
        }
        scan.close();
    }
}
