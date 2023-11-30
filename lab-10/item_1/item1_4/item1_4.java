package lab4;

import java.util.Scanner;

public class item1_4 {
    public static void main(String[] args) throws Exception {
        java.io.File file = new java.io.File("Salary.txt");

        Scanner input = new Scanner(file);
        String[] firstName = new String[1000];
        String[] lastName = new String[1000];
        String[] rank = new String[1000];
        double[] salarise = new double[1000];

        double allOfAssistantSalary = 0;
        double allOfAssociateSalary = 0;
        double allOfFullSalary = 0;

        int numberOfAssistant = 0;
        int numberOfAssociate = 0;
        int numberOfFull = 0;

        int i = 0;
        while (input.hasNext()) {
            firstName[i] = input.next();
            lastName[i] = input.next();
            rank[i] = input.next();
            salarise[i] = input.nextDouble();
            i++;
        }

        input.close();
        for (int j = 0; j < rank.length; j++) {
            switch (rank[j]) {
                case "assistant":
                    numberOfAssistant += 1;
                    allOfAssistantSalary += salarise[j];
                    break;

                case "associate":
                    numberOfAssociate += 1;
                    allOfAssociateSalary += salarise[j];
                    break;

                case "full":
                    numberOfFull += 1;
                    allOfFullSalary += salarise[j];
                    break;

                default:
                    break;

            }
        }

        System.out.printf("Total salary for assistant professor is %.2f\n", allOfAssistantSalary);
        System.out.printf("Total salary for associate professor is %.2f\n", allOfAssociateSalary);
        System.out.printf("Total salary for full professor is %.2f\n", allOfFullSalary);
        System.out.printf("Total salary for all professor is %.2f\n",
                allOfAssistantSalary + allOfAssociateSalary + allOfFullSalary);
        System.out.printf("Average salary for assistant professor is %.2f\n", allOfAssistantSalary / numberOfAssistant);
        System.out.printf("Average salary for associate professor is %.2f\n", allOfAssociateSalary / numberOfAssociate);
        System.out.printf("Average salary for full professor is %.2f\n", allOfFullSalary / numberOfFull);
        System.out.printf("Average salary for all professor is %.2f\n",
                (allOfAssistantSalary + allOfAssociateSalary + allOfFullSalary)
                        / (numberOfAssistant + numberOfAssociate + numberOfFull));

    }
}