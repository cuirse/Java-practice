package practice2;

//Income.java
/**
* ���������Income
*/
public abstract class Income {

	protected double income;

	public Income(double income) {
		this.income = income;
	}
	public abstract double getTax() ;

}