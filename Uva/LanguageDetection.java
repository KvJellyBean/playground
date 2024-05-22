// 12250
class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int i = 1;
        while (true) {
            String s = scan.next();
            if (s.equals("#")) {
                break;
            }
            if (s.equals("HELLO")) {
                System.out.println("Case " + i + ": ENGLISH");
            } else if (s.equals("HOLA")) {
                System.out.println("Case " + i + ": SPANISH");
            } else if (s.equals("HALLO")) {
                System.out.println("Case " + i + ": GERMAN");
            } else if (s.equals("BONJOUR")) {
                System.out.println("Case " + i + ": FRENCH");
            } else if (s.equals("CIAO")) {
                System.out.println("Case " + i + ": ITALIAN");
            } else if (s.equals("ZDRAVSTVUJTE")) {
                System.out.println("Case " + i + ": RUSSIAN");
            } else {
                System.out.println("Case " + i + ": UNKNOWN");
            }
            i++;
        }
    }}
