
public enum Cash {
	One(1), Five(5), Ten(10), Twenty(20), Hundred(100);
	
	private int value;
	
	/**
	 * Constructor method for cash
	 * @param value value of cash
		 */
	Cash(int value) {
		this.value = value ;
	}
	
	/**
	 * @return the value of cash
	 */
	public double getValue() {
		return value;
	}//closing getValue


	@Override
	public String toString(){
		return super.toString() + " Value: " + this.getValue();
	}
}
