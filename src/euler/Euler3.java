package euler;

public class Euler3 {

	public static void main(String[] args) {
		largestPrimeFactor(600851475143L);
	}

	public static void largestPrimeFactor(long num) {
		for (long i = 2; i <= num; i++) {
			if (num % i == 0) {
				num = num / i;
				System.out.println(i);
			}
		}
	}
}
