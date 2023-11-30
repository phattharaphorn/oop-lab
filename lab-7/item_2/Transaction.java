import java.util.*;
public class Transaction {
    
    //Attributes
    private Date date;
    private char type ;
    private double amount ;
    private double balance ;
    private String description = "NULL";

    //Constructors
    public Transaction(char type,double amount,double balance,String description){
        this.date = new Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }
    //Method
    public void printlnTransaction(){
        System.out.println(this.date + "\t"+this.type+"\t"+this.amount+"\t"+this.balance);
        if(!this.description.equals("NULL")){
            System.out.println(this.description);
        }
    }
}
