//Alex Chheng
public class ViewBalance {
    double balance; //Account total variable

    public ViewBalance(double balance) { //Constructor
        this.balance = balance; //this.balance refer to this class constructor variable
    }

    public double getBalance() {
        if (balance < 0){
            System.out.println("Error: Balance is below 0. Balance: " + balance); //Error notification, then continue
            return balance;
        }
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() { //May need to change or remove if balance is not an expected outcome
        return "ViewBalance{" +
                "balance=" + balance +
                '}';
    }
}
