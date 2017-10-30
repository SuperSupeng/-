package demo2;

public class TaxCalculatorMain {
	public static void main(String[] args) {
		TaxCalaculator calaculator = new TaxCalaculator(10000, 200, (s, b)->s*0.1 + b*0.15);
		System.out.println(calaculator.calculate());
	}
}
