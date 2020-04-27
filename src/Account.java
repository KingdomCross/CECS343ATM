
public class Account {
    private double balance;
    private Card card;
    public int route;
    public Transaction[] transaction;

    public Account(double balance, Card card, int route){
        this.balance = balance;
        this.card = card;
        this.route = route;
    }

    public void makeSelection(String selection){

    }

    public void withdraw(double amount){

    }

    public void deposit(double amount){
        

    }

    public String checkBalance(){
        return "The customers balance is $" + balance; 

    }

    public void addTransaction(){
      
    }

	 
    public int getCardNumber() {
    	return card.getNum();
    }

	public boolean verifyPin(int pin) {
		// TODO Auto-generated method stub
		return card.verifyingPin(pin);
	}

    
}
