package exercise.methodoverloading;

public class BasicRateTax {
	private static final double BASE_INCOME = 1000.00;
	
	private static final double BASE_TAX_RATE = 0.20;
	
	public double calcTax (){
		return BASE_INCOME * BASE_TAX_RATE;
	}
	
	public double calcTax(double grossIncome){
		if (grossIncome < BASE_INCOME){
			return calcTax();
		}
		return grossIncome * BASE_TAX_RATE;
	}
}
