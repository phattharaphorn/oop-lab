import java.lang.Math;

public class item_1 {
    public static void main(String[] args) {
        int a = 0;
        int counter = 1;
        int start = 2;
        while (counter <= 100) {
            if (isPrime(start) && isPalin(start)) {
                System.out.print(start + " ");
                counter++;
                a++;
                if (a == 10) {
                    System.out.println();
                    a = 0;
                }
            }
            start++;
        }
    }

    public static boolean isPalin(int x) {
        String s = Integer.toString(x);
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(int x) {
        if (x % 2 == 0 && x != 2) {
            return false;
        }

        int c = x / 2;
        for (int i = 2; i <= c; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}