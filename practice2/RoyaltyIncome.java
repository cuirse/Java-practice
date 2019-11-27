package practice2;

//RoyaltyIncome.java

public class RoyaltyIncome extends Income {

	public RoyaltyIncome(double income) {
		super(income);
	}
	
	@Override
	public double getTax() {
		
		return this.income * 0.2; 
	}
}
