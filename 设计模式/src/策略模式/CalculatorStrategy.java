package 策略模式;

@FunctionalInterface
public interface CalculatorStrategy {
	double calculate(double salay, double bonus);
}
