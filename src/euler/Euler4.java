package euler;

public class Euler4 {

	public static void main(String[] args) {

		System.out.println(largestPalindromeProduct());

	}

	public static long largestPalindromeProduct() {
		int max = 0;
		for (int i = 100; i <= 999; i++) {
			for (int j = 100; j <= 999; j++) {
				if (palindrome(j * i)) {
					max = Math.max(max, j*i);
				}
			}
		}
        return max;
	}

	public static long rev(long n) {
		String s = String.valueOf(n);
		StringBuffer sb=new StringBuffer(s).reverse();
		s=String.valueOf(sb);
		
		return Long.parseLong(s);
}

	public static boolean palindrome(int x) {
		String s1 = String.valueOf(x);
		String s2 = String.valueOf(rev(x));
		return s1.equals(s2);
	}

}
