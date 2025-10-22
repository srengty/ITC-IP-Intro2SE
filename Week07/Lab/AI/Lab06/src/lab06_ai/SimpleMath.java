package lab06_ai;

public class SimpleMath {
	public static double addition(double a, double b) {
		return a + b;
	}
	/**
	 * Subtraction between 2 numbers
	 * @param a real number
	 * @param b real number
	 * @return result of a - b
	 */
	public static double subtraction(double a, double b) {
		return a-b;
	}
	public static double division(double a, double b) {
		if(b==0) {
			throw new IllegalArgumentException("Infinity");
		}
		else return a / b;
	}
}
