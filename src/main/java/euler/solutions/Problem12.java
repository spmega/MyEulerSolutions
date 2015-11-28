package euler.solutions;

public class Problem12 {

	public Problem12() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		Problem12 instance = new Problem12();
		instance.getNumber(Integer.parseInt(args[0]));
	}
	
	public void getNumber(int numberOfDivisors){
		long num = 1;
		long sum = num;
		
		while(true){
			sum = getSum(num);
			System.out.println("The value of num is now:" + num + " and sum is :" + sum);
			int numOfDivisors = calculateDivisors(sum);
			System.out.println("the number of divisors are now:" + numOfDivisors);
			if(numOfDivisors >= numberOfDivisors){
				System.out.println("found the number: " + sum);
				break;
			}
			num++;
		}
	}
	
	public long getSum(long num){
		long sum = 0;
		
		for(long i = num; i > 0; i--){
			sum = sum + i;
		}
		
		return sum;
	}
	
	public int calculateDivisors(long sum){
		int counter = 0;
		
		for(long i = 1; i < sum/2; i++){
			if(sum % i == 0)
				counter++;
		}
		
		return counter;
	}

}
