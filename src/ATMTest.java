import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Random;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;


public final class ATMTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    public String test;
    public ATM dummy;
    @Before
    public void setUpStreams(){
        System.setOut(new PrintStream(outContent));
    }

    public ATM newdummy(){
        Random rand = new Random();
        Card card = new Card(rand.nextInt((int) Math.pow(10,17)), "4/20", rand.nextInt(10 ^ 4), "Denil Cx", "debit", 1234);
        Account checking = new Account(1000, card, rand.nextInt((int) Math.pow(10,10)));
        Account saving = new Account(100000, null, rand.nextInt((int) Math.pow(10,10)));
        Account[] accounts = {checking, saving};
        return new ATM(accounts, new CardScanner(), new Display(), new Dispencer());
    }


    @After
    public void restoreStreams(){
        System.setOut(originalOut);
    }

    @Test
    public void testInsertCard(){
        int pin = 1234;
        this.dummy = this.newdummy();
        assertTrue(this.dummy.insertCard(pin));
    }

    @Test
    public void testWithdraw(){
        this.dummy = this.newdummy();
        this.dummy.withdraw(100, 0);
        assertEquals( 900, this.dummy.account[0].balance, 0);
    }

    @Test
    public void testTransfer(){
        this.dummy = this.newdummy();
        this.dummy.transfer(0, 100);
        assertEquals(900, this.dummy.account[0].balance,  0);
        assertEquals(100100, this.dummy.account[1].balance, 0);
    }
}
