public class Main {

    public static void main(String[] args) {

    Bank bank = new Bank("A");
    bank.addBranch("branchName");
    bank.addCustomerToBranch("branchName", "Marian", 20312.2);
    bank.addCustomerToBranch("branchName", "Marian", 20312.2);
    bank.addCustomerToBranch("branchName", "Stefan", 3291.65);
    bank.addCustomerToBranch("branchName", "Ionut", 20312.2);
    bank.addCustomerToBranch("branchName", "Ioana", 3291.65);
    bank.addTransaction("branchName", "Marian", 20321.56);
    bank.listCustomers("branchName", true);

    }
}
