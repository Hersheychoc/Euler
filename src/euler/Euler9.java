package euler;

public class Euler9 {

	public static void main(String[] args) {
	pythagoreanTriplet();
	}

	public static void pythagoreanTriplet() {
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			for (int j = 1; j <= 1000; j++) {
				for (int k = 1; k <= 1000; k++) {
					if (i * i + j * j == k * k && i + j + k == 1000) {
						sum = i * j * k;
						System.out.println(sum);
						break;
					}
					
				}
			}
		}
	}
}
