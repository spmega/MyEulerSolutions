package euler.solutions;

public class Problem10_1 {

	public Problem10_1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println(new Problem10_1().run());
	}
	
	
	private static final int LIMIT = 2000000;
	
	public String run() {
		long sum = 0;
		for (int p : Library.listPrimes(LIMIT - 1))
			sum += p;
		return Long.toString(sum);
	}

}
