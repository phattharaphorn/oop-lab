public class Stock {
    // Attributes
    public String symbol;
    public String name;
    public double previousClosingPrice;
    public double currentPrice;

    // Constructors
    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    // Methods
    public double getChangePercent() {
        return (this.currentPrice - this.previousClosingPrice) * 100 / this.previousClosingPrice;
    }
}