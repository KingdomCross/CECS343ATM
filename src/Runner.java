import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Card card = new Card(rand.nextInt((int) Math.pow(10,17)), "4/20", rand.nextInt(10 ^ 4), "Denil Cx", "debit", 1234);
		Account checking = new Account(1000, card, rand.nextInt((int) Math.pow(10,10)));
		Account saving = new Account(100000, null, rand.nextInt((int) Math.pow(10,10)));
		Account[] accounts = {checking, saving};
		ATM atm = new ATM(accounts, new Display());
		UserInput ui = new UserInput(atm);
		ui.decision();
		System.out.println("Thank you for choosing Rona ATM");
	}
}

