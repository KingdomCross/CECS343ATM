public class Card{
    private int num;
    private String expiration;
    private int cvc;
    private String name;
    private String type;
    private int pin;

    public Card(int num, String expiration, int cvc, String name, String type, int pin){
        this.name = name;
        this.expiration = expiration;
        this.cvc = cvc;
        this.num = num;
        this.type = type;
        this.pin = pin;
    }

	public int getNum() {
		return num;
	}

	public String getExpiration() {
		return expiration;
	}

	public int getCvc() {
		return cvc;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

    public Boolean verifyingPin(int pin){
        return this.pin == pin;
    }

  
}