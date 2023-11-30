public class Tax {
     // Attributes
     private int fillingStatus;
     private static final String[] status = {
        "SINGLE_FILER",
        "MARRIED_JOINTLY_OR_QUALIFYING_WIDOW(ER)",
        "MARRIED_SEPARATELY",
        "HEAD_OF_HOUSEHOLD"
};
private int[][] brackets = {
    { 8350, 33950, 82250, 171550, 372950 }, // Single filer
    { 16700, 67900, 137050, 20885, 372950 }, // Married jointly-or qualifying widow(er)
    { 8350, 33950, 68525, 104425, 186475 }, // Married separately
    { 11950, 45500, 117450, 190200, 372950 } // Head of household
};
private double[] rates = { 0.10, 0.15, 0.25, 0.28, 0.33, 0.35 };
private double taxableIncome = 400000;

// Constructors
Tax(){

}
Tax(int fillingStatus, int[][] brackets, double[] rates, double taxableIncome){
 this.fillingStatus = fillingStatus ;
 this.brackets = brackets ;
 this.rates = rates ;
 this.taxableIncome = taxableIncome ;    
}

//Methods
public String getStatus() {
    return status[this.fillingStatus];
}

public void setStatus(int fillingStatus) {
    this.fillingStatus = fillingStatus;
}

public int[][] getBrackets() {
    return this.brackets;
}

public void setBrackets(int[][] brackets) {
    this.brackets = brackets;
}

public double[] getRates() {
    return this.rates;
}

public void setRates(double[] rates) {
    this.rates = rates;
}

public double getTaxableIncome() {
    return this.taxableIncome;
}

public void setTaxableIncome(double taxableIncome) {
    this.taxableIncome = taxableIncome;
}

public double getTax() {
    return this.brackets[this.fillingStatus][0] * this.rates[0] +
            (this.brackets[this.fillingStatus][1] - this.brackets[this.fillingStatus][0]) * this.rates[1] +
            (this.brackets[this.fillingStatus][2] - this.brackets[this.fillingStatus][1]) * this.rates[2] +
            (this.brackets[this.fillingStatus][3] - this.brackets[this.fillingStatus][2]) * this.rates[3] +
            (this.brackets[this.fillingStatus][4] - this.brackets[this.fillingStatus][3]) * this.rates[4] +
            (this.taxableIncome - this.brackets[this.fillingStatus][4]) * this.rates[5];
}
}
