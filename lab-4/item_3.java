public class item_3 {
    static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static boolean isPalindrome(int n) {
        int a = n;
        int number = 0;
        while (n > 0) {
            number *= 10;
            number += n % 10;
            n /= 10;
        }
        return a == number;
    }

    public static void selectionSort(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;// searching for lowest index
                }
            }
            double smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    public static void main(String[] args) {
        System.out.println("Creating a list containing 1000 elements,");
        double[] arr = new double[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random() * 1000;
        }
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%10.2f", arr[i]);
            if (i % 5 == 0) {
                System.out.println();
            }
        }
        System.out.println("    ...");
        for (int i = 990; i <= 999; i++) {
            System.out.printf("%10.2f", arr[i]);
            if (i == 994) {
                System.out.println();
            }
        }
        System.out.println("List created.");
        System.out.println("Sorting stopwatch starts...");
        StopWatch stopWatch = new StopWatch();
        selectionSort(arr);
        stopWatch.stop();
        for (int i = 0; i < 10; i++) {
            System.out.printf("%10.2f", arr[i]);
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }
        System.out.println("      ...");
        for (int i = 995; i < 1000; i++) {
            System.out.printf("%10.2f", arr[i]);
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }
        System.out.println("Sorting stopwatch stoped.");
        System.out.printf("The sort time is %.1f milliseconds.\n", stopWatch.getElapsedTime());
        System.out.println("------------------------------------------------------------");
        System.out.println("The palindromPrime stopwatch starts...");
        System.out.println("Creating 1000 PalindromPrime...");

        stopWatch.start();
        int count = 0;
        for (int i = 0; count < 1000; i++) {
            if (isPalindrome(i) && isPrime(i)) {
                count++;
                System.out.print(i);
                if (count % 10 == 0) {
                    System.out.println();
                } else {
                    System.out.print(" ");
                }
            }
        }
        stopWatch.stop();
        System.out.println("PalindromePrime created.");
        System.out.println("The palindromPrime stopwatch stoped.");

        System.out.printf("The palindromPrime time is %.1f milliseconds.", stopWatch.getElapsedTime());
    }
}