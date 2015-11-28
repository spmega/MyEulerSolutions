package euler.solutions;
/*

The sum of the squares of the first ten natural numbers is,
1^2 + 2^2 + ... + 10^2 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)^2 = 552 = 3025

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

*/

public class Problem6{
	public Problem6(){

	}

	public static void main(String[] args){
		System.out.println("Hello World");

		Problem6 instance = new Problem6();

		long resultSum = instance.getSum(Long.parseLong(args[0]));

		System.out.println("" + resultSum);

		long resultSquare = instance.getSquare(Long.parseLong(args[0]));

		System.out.println("" + resultSquare);

		System.out.println(resultSquare-resultSum);
	}

	public long getSum(Long max){
		long sum = 0L;

		for(long i = 1; i <= max; i++){
			sum = sum + (i*i);
		}

		return sum;
	}

	public long getSquare(long max){
		long sum = 0L;

		for(long i = 1; i <= max; i++){
			sum = sum + i;
		}

		return sum * sum;
	}
}
/*
MY IDEA

The simplest solution is to follow directions

*/