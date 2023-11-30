import java.util.Scanner ;
public class item_5 {
    public static void main(String[] args) {
        System.out.println("Filing Status");
        System.out.println("\t[0]-Single filer");
        System.out.println("\t[1]-Married jointly or qualifying widow(er)");
        System.out.println("\t[2]-Married separately");
        System.out.println("\t[3]-Head of household");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the filing status: ");
        int i = in.nextInt();
        System.out.print("Enter the taxable income: ");
        double income = in.nextDouble();
        double[] rates = { 0.10, 0.15, 0.25, 0.28, 0.33, 0.35 };
        int[][] brackets = {
                { 8350, 33950, 82250, 171550, 372950 },
                { 16700, 67900, 137050, 20885, 372950 },
                { 8350, 33950, 68525, 104425, 186475 },
                { 11950, 45500, 117450, 190200, 372950 }
        };
        Tax tax = new Tax(i, brackets, rates, income);
        System.out.println("Tax is " + tax.getTax());
        in.close();
    }
    
}
