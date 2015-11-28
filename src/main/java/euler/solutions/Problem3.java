package euler.solutions;
/*


The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?

*/

import java.util.Set;
import java.util.HashSet;
import java.util.Collections;

public class Problem3{
	public Problem3(){

	}

	public static void main(String[] args){
		System.out.println("Hello World");
		long num = Long.parseLong(args[0]);

		Problem3 instance = new Problem3();

		//max prime factor
		System.out.println(instance.getMaxPrimeFactor(Long.parseLong(args[0])));
	}

	public long getMaxPrimeFactor(long num){
		long getSmallFact = 2;
		long quotient = num;

		while(true){
			if(quotient > 1){
				getSmallFact = getSmallestPrimeFactor(quotient);
				quotient = quotient / getSmallFact;
		//		System.out.println(quotient);
				continue;
			}
			break;
		}
		return getSmallFact;
	}

	public long getSmallestPrimeFactor(long num){
		//System.out.println(" for;"+num);
		for(long i = 2; i <= Math.sqrt(num); i++){
			if(num % i == 0){
		//		System.out.println("SmallestPrimeFactor is " +i);
				return i;
			}
		}
		return num;
	}
}

/*
prime numbers are numbers only divisible by 1 and itself

in order to find the largest prime factor, you have to find all the prime factors first
in order to find all the prime factors you must take a variable, and starting from two, divide the number by this variable until the number cannot be divided by this variable no more
after that, you increment the variable again and start the process again
*/

