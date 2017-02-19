package euler;

public class Euler1 {

	public static void main(String[] args) {
		multiplesOf3And5(1000);
	}

	public static void multiplesOf3And5(int x) {
		int sum = 0;
		for (int i = 1; i < x; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println("Sum is: " + sum);
	}
}
