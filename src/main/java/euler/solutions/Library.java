package euler.solutions;

public class Library {

	// Tests whether the given integer is prime.
	/*public static boolean isPrime(int x) {
		if (x < 0)
			throw new IllegalArgumentException("Negative number");
		if (x == 0 || x == 1)
			return false;
		else if (x == 2)
			return true;
		else {
			if (x % 2 == 0)
				return false;
			for (int i = 3, end = sqrt(x); i <= end; i += 2) {
				if (x % i == 0)
					return false;
			}
			return true;
		}
	}*/
	
	
	// Returns a Boolean array 'isPrime' where isPrime[i] indicates whether i is prime, for 0 <= i <= n.
	// For a large batch of queries, this is faster than calling isPrime() for each integer.
	// For example: listPrimality(100) = {false, false, true, true, false, true, false, true, false, false, ...} (array length 101).
	public static boolean[] listPrimality(int n) {
		if (n < 0)
			throw new IllegalArgumentException("Negative array size");
		boolean[] result = new boolean[n + 1];
		if (n >= 2)
			result[2] = true;
		for (int i = 3; i <= n; i += 2)
			result[i] = true;
		// Sieve of Eratosthenes
		for (int i = 3, end = sqrt(n); i <= end; i += 2) {
			if (result[i]) {
				// Note: i * i does not overflow
				for (int j = i * i; j <= n; j += i << 1)
					result[j] = false;
			}
		}
		return result;
	}
	
	// Returns all the prime numbers less than or equal to n, in ascending order.
	// For example: listPrimes(97) = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, ..., 83, 89, 97}.
	public static int[] listPrimes(int n) {
		boolean[] isprime = listPrimality(n);
		int count = 0;
		for (boolean b : isprime) {
			if (b)
				count++;
		}
		
		int[] result = new int[count];
		for (int i = 0, j = 0; i < isprime.length; i++) {
			if (isprime[i]) {
				result[j] = i;
				j++;
			}
		}
		return result;
	}
	
	// Returns floor(sqrt(x)), for x >= 0.
	public static long sqrt(long x) {
		if (x < 0)
			throw new IllegalArgumentException("Square root of negative number");
		long y = 0;
		for (long i = 1L << 31; i != 0; i >>>= 1) {
			y |= i;
			if (y > 3037000499L || y * y > x)
				y ^= i;
		}
		return y;
	}
	
	// Returns floor(sqrt(x)), for x >= 0.
		public static int sqrt(int x) {
			if (x < 0)
				throw new IllegalArgumentException("Square root of negative number");
			int y = 0;
			for (int i = 32768; i != 0; i >>>= 1) {
				y |= i;
				if (y > 46340 || y * y > x)
					y ^= i;
			}
			return y;
		}

}
