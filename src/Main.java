
public class Main {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            if (checkSNT(i)) {
                System.out.print(i + " ");
                i += 1;
            }
        }
    }

    public static boolean checkSNT(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}