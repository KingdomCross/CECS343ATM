//Alex Chheng
public class ViewBalance {
    double balance; //Account total variable

    public ViewBalance() { //Constructor
        balance = 0;
    }

    public double getBalance(double n){
        balance  = n;
        return balance;
    }

    @Override
    public String toString() {
        return "ViewBalance{" +
                "balance=" + balance +
                '}';
    }
}
