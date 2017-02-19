package euler;

public class Euler5 {

	public static void main(String[] args) {
		smallestMultiple();
	}

	private static void smallestMultiple() {
		
		for (int i = 2; i > 0; i++) {
			if (check(i)) {
				System.out.println(i);
				break;
			}
		}

		}
	public static boolean check(int x) {
		for (int i = 2; i <= 20; i++) {
			if (x % i != 0) {
				return false;
			}
		}
		return true;
	}
	}



























