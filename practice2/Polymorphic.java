package practice2;

public class Polymorphic {

	public static void main(String[] args) {
		// TODO: �ó������һ���й�������͸�������С�����˰:
		Income[] incomes = new Income[] { new SalaryIncome(7500), new RoyaltyIncome(12000) };
		double total = 0;
		for(Income income : incomes) {
			total += income.getTax();
		}
		System.out.println(total);
	}

}




