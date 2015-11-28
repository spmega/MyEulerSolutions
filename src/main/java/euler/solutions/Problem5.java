package euler.solutions;
/*

2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

*/

public class Problem5{
	public Problem5(){

	}

	public static void main(String[] args){
		System.out.println("Hello World");
		Problem5 instance = new Problem5();

		long num = instance.getNumber(Long.parseLong(args[0]),Long.parseLong(args[1]));

		System.out.println(num);
	}

	public long getNumber(long min, long max){
		long divider = max;
		long counter = 1;
		System.out.println("__________________________________________");

		while(!divisible(divider, min, max)){
			divider = max * counter;
			System.out.println("::"+divider);
			counter++;
		}

		return divider;
	}

	public boolean divisible(long divider, long min, long max){
		for(long i = min; i < max; i++){
			if(divider % i != 0){
				System.out.println("in condition");
				return false;
			}
		}

		return true;
	}
}

/*
MY IDEA

in order to find the smallest positive integer that can be divisible by the numbers from 1 to 20,
I must divide all numbers below 20 with different multiples of 20
*/