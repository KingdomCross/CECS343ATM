import java.util.Random;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		Cash[] cash = {Cash.One};
		Customer denil = new Customer(cash, 1);
		Card card = new Card(rand.nextInt(10 ^ 17), "4/20", rand.nextInt(10 ^ 4), "Denil Cx", "debit", 1234);
		Account checking = new Account(1000, card, rand.nextInt(10 ^ 10));
		Account saving = new Account(100000, null, rand.nextInt(10 ^ 9));
		Account[] accounts = {checking, saving};
		ATM atm = new ATM(accounts, new CardScanner(), new Display(), new Dispencer());

	}
}
