import java.io.*;
import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App extends Application {
    private TextField tfAnnualInterestRate = new TextField();
    private TextField tfNumberOfYears = new TextField();
    private TextField tfLoanAmount = new TextField();
    private TextField tfMonthlyPayment = new TextField();
    private TextField tfTotalPayment = new TextField();
    private Button btCalculate = new Button("Calculate");
    private Button btSave = new Button("Save");
    private Button btLoad = new Button("Load");
    private Button btClear = new Button("Clear");

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {

        // Create UI and their obj.
        GridPane gridPane = new GridPane();
        HBox hBox1 = new HBox(10);
        HBox hBox2 = new HBox(10);

        gridPane.add(new Label("Annual Interest Rate:"), 0, 0);
        gridPane.add(tfAnnualInterestRate, 1, 0);
        gridPane.add(new Label("Number of Years:"), 0, 1);
        gridPane.add(tfNumberOfYears, 1, 1);
        gridPane.add(new Label("Loan Amount:"), 0, 2);
        gridPane.add(tfLoanAmount, 1, 2);
        gridPane.add(new Label("Monthly Payment:"), 0, 3);
        gridPane.add(tfMonthlyPayment, 1, 3);
        gridPane.add(new Label("Total Payment:"), 0, 4);
        gridPane.add(tfTotalPayment, 1, 4);

        gridPane.add(hBox1, 0, 10);
        gridPane.add(hBox2, 1, 10);

        // Set properties for gridPane
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.setAlignment(Pos.CENTER);

        hBox1.setAlignment(Pos.BASELINE_LEFT);
        hBox1.getChildren().addAll(btSave, btLoad);
        hBox2.setAlignment(Pos.BASELINE_RIGHT);
        hBox2.getChildren().addAll(btClear, btCalculate);

        tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
        tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
        tfLoanAmount.setAlignment(Pos.BOTTOM_RIGHT);
        tfMonthlyPayment.setAlignment(Pos.BOTTOM_RIGHT);
        tfTotalPayment.setAlignment(Pos.BOTTOM_RIGHT);
        tfMonthlyPayment.setEditable(false);
        tfTotalPayment.setEditable(false);
        
        // Process events
        btSave.setOnAction(e -> saveLoanPayment());
        btLoad.setOnAction(e -> loadLoanPayment());
        btClear.setOnAction(e -> clearLoanPayment());
        btCalculate.setOnAction(e -> calculateLoanPayment());

        // Create a scene and place it in the stage
        Scene scene = new Scene(gridPane, 400, 250);
        primaryStage.setTitle("LoanCalculator"); // Set title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    private void saveLoanPayment() {
        Loan loan;
        try {
            double interest = Double.parseDouble(tfAnnualInterestRate.getText());
            int year = Integer.parseInt(tfNumberOfYears.getText());
            double loanAmount = Double.parseDouble(tfLoanAmount.getText());
            loan = new Loan(interest, year, loanAmount);
        } catch (Exception e) {
            return;
        }
        try (ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("loan.dat"))) {
            o.writeObject(loan);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void loadLoanPayment() {
        try (ObjectInputStream o = new ObjectInputStream(new FileInputStream("loan.dat"))) {
            Loan loan = (Loan)o.readObject();
            tfAnnualInterestRate.setText(loan.getAnnualInterestRate() + "");
            tfNumberOfYears.setText(loan.getNumberOfYears() + "");
            tfLoanAmount.setText(loan.getLoanAmount() + "");
            tfMonthlyPayment.setText(String.format("$%.2f", loan.getMonthlyPayment()));
            tfTotalPayment.setText(String.format("$%.2f", loan.getTotalPayment()));
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }

    private void clearLoanPayment() {
        tfAnnualInterestRate.clear();
        tfLoanAmount.clear();
        tfMonthlyPayment.clear();
        tfNumberOfYears.clear();
        tfTotalPayment.clear();
    }

    private void calculateLoanPayment() {
        // Get values from text fields
        double interest = Double.parseDouble(tfAnnualInterestRate.getText());
        int year = Integer.parseInt(tfNumberOfYears.getText());
        double loanAmount = Double.parseDouble(tfLoanAmount.getText());

        // Create a loan object. Loan defined in Listing 10.2
        Loan loan = new Loan(interest, year, loanAmount);

        // Display monthly payment and total payment
        tfMonthlyPayment.setText(String.format("$%.2f",
                loan.getMonthlyPayment()));
        tfTotalPayment.setText(String.format("$%.2f",
                loan.getTotalPayment()));
    }

    public static void main(String[] args) {
      launch(args);
    }
}