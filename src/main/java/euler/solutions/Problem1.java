package euler.solutions;

/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
*/

public class Problem1{

	public Problem1(){

	}

	public static void main(String[] args){
		System.out.println("Hello World");
		Problem1 instance = new Problem1();

		instance.calculate();
	}

	public void calculate(){
		int calcThree = 3;
		int calcFive = 5;
		int sum = 0;

		for(int i = 0; i < 1000; i++){
			if(i % calcThree == 0 || i % calcFive == 0){
				System.out.println(i);
				sum = i + sum;
			}
		}

		System.out.println("Sum of multiples 3 and 5 are:" + sum);
	}
}