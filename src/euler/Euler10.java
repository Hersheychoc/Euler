package euler;

public class Euler10 {

	 private static boolean isPrime(int num) {
	        if (num == 2) return true;
	        for (int i = 2; 
	        		i <= num / 2 ; i++) {
	            if (num % i == 0) return false;
	        }
	        return true;
	    }
	    
	    private static long sumPrimesBelow(int limit) {
	        long primesSum = 0;
	        for (int i = 2; i < limit; i++) {
	            if (isPrime(i)) primesSum += i;
	        }
	        return primesSum;
	    }
	    
	    public static void main(String[] args) {
	        System.out.println(sumPrimesBelow(2000000));
	    }
}
