//Alex Chheng
public class ViewBalance {
    double balance; //Account total variable

    public ViewBalance() { //Constructor
        balance = 0;
    }

    public double getBalance() {
        if (balance < 0){
            System.out.println("Error: Balance is below 0"); //Error notification, then continue
            return balance;
        }
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "ViewBalance{" +
                "balance=" + balance +
                '}';
    }
}
