package lab3;

import java.io.*;

public class item1_3 {
    /** Main method */
    public static void main(String[] args) throws FileNotFoundException {
        // Create File object
        File file = new File("Salary.txt");

        // Check if file exists
        if (file.exists()) {
            System.out.println("File " + file.getName() + " already exists");
            System.exit(0);
        }
        String rank = "";
        double salary;
        try (
                // Create output file
                PrintWriter output = new PrintWriter(file);) {
            // Save data to file
            for (int i = 1; i <= 1000; i++) {
                output.print("FirstName" + i + " LastName" + i);
                rank = getRank();
                salary = getSalary(rank);
                output.printf(" " + rank + " %.2f\n", salary);
            }
        }
    }

    /** Return a randomly generated rank */
    public static String getRank() {
        String[] ranks = { "assistant", "associate", "full" };
        return ranks[(int) (Math.random() * ranks.length)];
    }

    /** Return a randomly generated salary */
    public static double getSalary(String rank) {
        if (rank.equals("assistant"))
            return 50000 + (double) (Math.random() * 30001);
        else if (rank.equals("associate"))
            return 60000 + (double) (Math.random() * 50001);
        else
            return 75000 + (double) (Math.random() * 55001);
    }
}