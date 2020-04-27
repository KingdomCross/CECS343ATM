//Denil Poudel
//Edwin Hernandez
//Alex Chheng
//Erick Leyva
public class ATM {
    public Card card; 
    public UserInput input; //User input shouldn't be a instance variable remove later
    public Account[] account;
    private CardScanner scanner;
    private Display display;
    private Dispencer dispenser;
  
    public ATM(Account[] accounts, CardScanner cs, Display display, Dispencer dispencer){
        this.account = accounts;
        this.scanner = cs;
        this.display = display;
        this.dispenser = dispencer;
        display.welcome();
    }
      
    
    public boolean insertCard(int pin) {
    	boolean valid = false;
    	valid = account[0].verifyPin(pin);     	    
    	return valid;
    }

    public void withdraw(){

    }

    public void transfer(){

    }
    
    public void replenishCash() {
    	
    }
    
    public String checkBalance(){
        return account[0].checkBalance();
    }

    private void display(String message) {
    	
    }
} 
