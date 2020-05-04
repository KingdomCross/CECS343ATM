//Denil Poudel
//Edwin Hernandez
//Alex Chheng
//Erick Leyva
public class ATM {
    public Card card; 
    public UserInput input; //User input shouldn't be a instance variable remove later
    public Account[] account;
    private Display display;

  
    public ATM(Account[] accounts, Display display){
        this.account = accounts;
        this.display = display;
    }

    public void welcome(){
        this.display.welcome();
    }

    public void invalidPin(){
        this.display.invalidPin();
    }
    
    public boolean insertCard(int pin) {
    	boolean valid = false;
    	valid = account[0].verifyPin(pin);     	    
    	return valid;
    }

    public void withdraw(int amount, int account){
        this.account[account].withdraw(amount);
    }

    public void transfer(int account, int amount){
        if(account == 0){
            System.out.println("Checkings:");
        }
        else {
            System.out.println("Savings");
        }
        boolean successful = this.account[account].withdraw(amount);
        if(account == 0) {
            System.out.println("Savings:");
            this.account[1].deposit(amount);
        }
        else {
            System.out.println("Checkings:");
            this.account[0].deposit(amount);
        }
        if(successful) {
            System.out.println("Successfully transferred " + amount);
        }
    }

    public void deposit(int amount, int account){
        this.account[account].deposit(amount);
    }
    
    public String checkBalance(int index){
        return account[index].checkBalance();
    }
} 
