
public class Account {
    private double balance;
    private Card card;
    public int route;
    public Transaction[] transaction;

    public Account(double balance, Card card, int route, Transaction[] transaction){
        this.balance = balance;
        this.card = card;
        this.route = route;
        this.transaction = transaction;
    }

    public void makeSelection(String selection){
        return; 
    }

    public void withdraw(double amount){
        
        return; 
    }

    public void deposit(double amount){
        
        return; 
    }

    public String checkBalance(){
        
        return "The customers balance is $" + balance; 
    }

	 
    public int getCardNumber() {
    	return card.getNum();
    }

	public boolean verifyPin(int pin) {
		// TODO Auto-generated method stub
		return card.verifyingPin(pin);
	}

    
}
