
public class User {

	public double total;
	public Cash[] cash; //should be array but in the class diagram it is a single instance



    public User(Cash[] cash, double total){
        this.cash = cash;
        this.total = total; 
    }
	
	public void makeSelection() {
		//UML diagram has it as make_selection
		
	}
	public void depositMoney() {
		//UML diagram has it as deposit_money
	
	}
	
	public void withdrawMoney() {
		//UML diagram has it as withdraw_money
	}
	
	
}
