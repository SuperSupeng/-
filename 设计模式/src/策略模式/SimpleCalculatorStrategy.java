package demo2;

public class SimpleCalculatorStrategy implements CalculatorStrategy{

	private final static double SALARY_RATE = 0.1;
	private final static double BOUNS_RATE = 0.15;
	
	@Override
	public double calculate(double salay, double bonus) {
		return salay * SALARY_RATE + bonus * BOUNS_RATE;
	}

}
