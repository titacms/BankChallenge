import java.util.ArrayList;

public class Bank {

    private String bankName;
    private ArrayList<Branch> branches = new ArrayList<>();

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null){
            Branch branch = new Branch(branchName);
            this.branches.add(branch);
            return true;
        }
        return false;
    }

    public boolean addCustomerToBranch(String branchName, String customerName, double initialAmount ){
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.addCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addTransaction(String branchName, String customerName, double amount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            branch.addCustomerTransaction(customerName, amount);
            return true;
        }
        return false;
    }


    public void listCustomers(String branchName, boolean showTransactions){
        Branch branch = findBranch(branchName);
        if(branch != null){
            System.out.println("Customer details for branch " + branch.getBranchName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for(int i = 0; i < branchCustomers.size(); i++){
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getCustomerName());
                if(showTransactions){
                    ArrayList<Double> customerTransactions = branchCustomer.getTransactions();
                    for(int j = 0; j < customerTransactions.size(); j++){
                        System.out.println("Transactions : [" + (j+1) + "] " + customerTransactions.get(j));
                    }
                }
            }
        } else {
            System.out.println("Problem finding branch");
        }
    }


    private Branch findBranch(String branchName){
        for(int i = 0; i < branches.size(); i++){
            Branch checkedBranch = this.branches.get(i);
            if(checkedBranch.getBranchName().equals(branchName)){
                return checkedBranch;
            }
        }
        return null;
    }

    public String getBankName() {
        return bankName;
    }
}
