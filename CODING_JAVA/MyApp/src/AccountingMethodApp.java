
public class AccountingMethodApp {

	public static double valueOfSupply;
	public static double vatRate;
	public static double vat;
	public static double expenseRate;
	public static void main(String[] args) {

		valueOfSupply = 10000.0;
		vatRate = 0.1;
		expenseRate = 0.3;
		
	
		print();
	
		
	}

	public static void print() {
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + getVAT());
		System.out.println("Total : " + getTotal());
	    System.out.println("Expense : " + getExpense());
		System.out.println("Income : " + getIncome());
		System.out.println("Dividend : " + getDividend1());
		System.out.println("Dividend : " + getDividend2());
		System.out.println("Dividend : " + getDividend3());
	}

	public static double getDividend1() {
		double dividend1 = getIncome() * 0.5;
		return dividend1;
	}
	public static double getDividend2() {
		double dividend2 = getIncome() * 0.3;
		return dividend2;
	}
	public static double getDividend3() {
		double dividend3 = getIncome() * 0.2;
		return dividend3;
	}
	
	public static double getIncome() {
		double income = valueOfSupply - getExpense();
		return income;
	}

	public static double getExpense() {
		double expense = valueOfSupply*expenseRate;
		return expense;
	}

	public static double getTotal() {
		return valueOfSupply + getVAT();
	}

	
	private static double getVAT() {
		return valueOfSupply*vatRate;
	}

	
}
