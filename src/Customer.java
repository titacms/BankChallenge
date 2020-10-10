import java.util.ArrayList;

public class Customer {

    private String customerName;
    private ArrayList<Double> transactions = new ArrayList<>();

    public Customer(String customerName, double initialTransaction) {
        this.customerName = customerName;
        addTransaction(initialTransaction);

    }

    public void addTransaction(double transaction){
        transactions.add(transaction);
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}