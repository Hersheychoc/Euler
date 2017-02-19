package euler;

public class Euler6 {

	public static void main(String[] args) {
		sumSquareDifference(100);
	}
	
	public static void sumSquareDifference(int num) {
		int sumOfSquare = 0;
		int squareOfSum = 0;
		for (int i = 1; i <= num; i++) {
			int x = (int) Math.pow(i, 2);
			sumOfSquare += x;
			squareOfSum += i;
		}
		int y = (int) Math.pow(squareOfSum, 2);
		int z = y - sumOfSquare;
		System.out.println("Answer: "+z);
	}
}
