package Uva;
// 12503
class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            int[] instructions = new int[n];
            int position = 0;
            
            for (int j = 0; j < n; j++) {
                String line = sc.nextLine();
                
                if (line.equals("LEFT")) {
                    instructions[j] = -1;
                } else if (line.equals("RIGHT")) {
                    instructions[j] = 1;
                } else {
                    String[] parts = line.split(" ");
                    int k = Integer.parseInt(parts[2]);
                    instructions[j] = instructions[k - 1];
                }
                position += instructions[j];
            }
            System.out.println(position);
        }
        sc.close();
    }
}
