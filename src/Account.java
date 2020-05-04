import java.util.ArrayList;

public class Account {
    public double balance;
    private Card card;
    public int route;
    public ArrayList<String> transaction;

    public Account(double balance, Card card, int route){
        this.balance = balance;
        this.card = card;
        this.route = route;
        this.transaction = new ArrayList<String>();
    }


    public boolean withdraw(int amount){
        if(amount <= this.balance){
            this.balance -= amount;
            String tran = "Withdrew: " + amount + ", balance is now " + this.balance;
            this.transaction.add(tran);
            System.out.println(tran);
            return true;
        }
        else {
            System.out.println("Not enough in the balance");
            return false;
        }
    }

    public void deposit(double amount){
        this.balance += amount;
        String tran = "Deposited: " + amount + ", balance is now " + this.balance;
        this.transaction.add(tran);
        System.out.println(tran);
    }

    public String checkBalance(){
        return "Your balance is $" + balance;
    }

	public boolean verifyPin(int pin) {
		return card.verifyingPin(pin);
	}
}
