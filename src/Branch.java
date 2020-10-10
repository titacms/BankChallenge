import java.util.ArrayList;

public class Branch {

    private String branchName;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Branch(String branchName) {
        this.branchName = branchName;
    }

    public boolean addCustomer(String customerName, double initialTransaction){
        if(findCustomer(customerName) == null){
            Customer customer = new Customer(customerName, initialTransaction);
            this.customers.add(customer);
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null){
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName){
        for(int i = 0; i < customers.size(); i++){
            if(customers.get(i).getCustomerName().equals(customerName)){
                return customers.get(i);
            }
        }
        return null;
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
