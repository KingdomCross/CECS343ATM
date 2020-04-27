import java.util.Scanner;

public class UserInput {
    public User user;
    public ATM atm;

    public UserInput(User user, ATM atm){
        this.user = user;
        this.atm = atm;
    }

    public void decision(int dec){
        switch (dec){
            case 0:
                Scanner sc = new Scanner(System.in);
                System.out.println("You choose 0");
                System.out.println("Enter pin: ");
                int pin = sc.nextInt();
                if(this.atm.insertCard(pin)){
                    this.options();
                }
                break;
            case 1:
                System.out.println("You choose 1");
        }
    }

    public void options(){
        System.out.println("[0] Withdraw Money");
        System.out.println("[1] Transfer Money");
        System.out.println("[2] Check Balance");
        System.out.println("[3] Exit");
        Scanner sc = new Scanner(System.in);
        int decision = sc.nextInt();
        switch (decision){
            case 0:
//                atm.withdraw();
            case 1:
//                atm.transfer();
            case 2:
                System.out.println(atm.checkBalance());
        }
    }
}
