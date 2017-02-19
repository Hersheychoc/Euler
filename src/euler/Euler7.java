package euler;

public class Euler7 {

	public static void main(String[] args) {
		primeNumber(10001);
	}
	
	public static void primeNumber(int num) {
		int counter = 0;
		for (int i = 2; i > 0; i++) {
		       if (isPrime(i)) {
					counter++;
				}
				if (counter == num) {
					 System.out.println("The number is: "+i);
					 break;
				}
		}
	}
	
	public  static boolean isPrime(int x) {
		for (int j = 2; j <= x/2; j++) {
			if (x % j == 0) {
				return false;
			}
		}
		return true;
	}
}
