import java.util.Scanner;

public class UserInput {
    public ATM atm;

    public UserInput(ATM atm){
        this.atm = atm;
    }

    public void decision(){
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        while(!exit) {
            atm.welcome();
            int dec = sc.nextInt();
            switch (dec) {
                case 0:
                    System.out.println("Card inserted");
                    boolean exit1 = false;
                    boolean pinOK = false;
                    while(!exit1) {
                        System.out.println("Enter pin:");
                        int pin = sc.nextInt();
                        if (this.atm.insertCard(pin)) {
                            exit1 = true;
                            pinOK = true;
                        } else {
                            this.atm.invalidPin();
                            switch (sc.nextInt()){
                                case 0:
                                    break;
                                case 1:
                                    exit1 = true;
                                    exit = true;
                            }
                        }
                    }
                    if(pinOK) {
                        exit = this.options();
                    }
                    break;
                case 1:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
        sc.close();
    }

    public boolean options(){
        boolean cond = true;
        while(cond){
            System.out.println("[0] Withdraw Money");
            System.out.println("[1] Transfer Money");
            System.out.println("[2] Check Balance");
            System.out.println("[3] Deposit Money");
            System.out.println("[4] Exit");
            Scanner sc = new Scanner(System.in);
            int account;
            int amount;
            int decision = sc.nextInt();
            switch (decision) {
                case 0:
                	System.out.println("------------------------------------------------");
                    System.out.println("Where would you like to withdraw from?");
                    System.out.println("[0] Checkings");
                    System.out.println("[1] Savings");
                    account = sc.nextInt();
                    System.out.println("Enter amount to withdraw:");
                    amount = sc.nextInt();
                    atm.withdraw(amount, account);
                    break;

                case 1:
                	 System.out.println("------------------------------------------------");
                    System.out.println("Where would you like to transfer from?");
                    System.out.println("[0] Checkings");
                    System.out.println("[1] Savings");
                    account = sc.nextInt();
                    System.out.println("Enter amount to transfer:");
                    amount = sc.nextInt();
                    atm.transfer(account, amount);
                    break;
                case 2:
                    System.out.println("------------------------------------------------");
                    System.out.println("What account balance would you like to see?");
                    System.out.println("[0] Checkings");
                    System.out.println("[1] Savings");
                    int acIndex = sc.nextInt();
                    System.out.println(atm.checkBalance(acIndex));
                    break;
                case 3:
                	System.out.println("------------------------------------------------");
                    System.out.println("What account would you like to deposit to?");
                    System.out.println("[0] Checkings");
                    System.out.println("[1] Savings");
                    account = sc.nextInt();
                    System.out.println("How much would you like to deposit?");
                    amount = sc.nextInt();
                    atm.deposit(amount, account);
                    break;
                case 4:
                    cond = false;
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
        return true;
    }
}
