package euler.solutions;
/*


By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10,001st prime number?

*/

import java.util.Set;
import java.util.HashSet;
import java.math.BigInteger;

public class Problem7{
	public Problem7(){

	}

	public static void main(String[] args){
		System.out.println("Hello World");

		Problem7 instance = new Problem7();

		BigInteger temp = instance.getBigPrimeNum(Integer.parseInt(args[0]));

		temp.toString();
	}

	public BigInteger getBigPrimeNum(int max){
		Set<BigInteger> primeSet = new HashSet<BigInteger>();
		BigInteger num = BigInteger.ONE.add(BigInteger.ONE);
		BigInteger result = null;

		BigInteger temp = num;
		//System.out.println("In BigInteger method");

		while(primeSet.size() <= max){
			if(temp.equals(BigInteger.ONE.add(BigInteger.ONE))){
				primeSet.add(num);
				//System.out.println("Adding 2 to Set");
			} else if(isPrime(temp, primeSet)){
				primeSet.add(temp);
				//System.out.println("Adding " + temp.toString() +  " to Set");
			}

			if(primeSet.size() == max){
				result = temp;
				//System.out.println("Breaking out of loop");
				break;
			}
			temp = temp.add(BigInteger.ONE);
			//System.out.println("temp = " + temp.toString());
		}
		System.out.println("result = " + result.toString());
		return result;
	}

	public boolean isPrime(BigInteger num, Set<BigInteger> primeSet){
		BigInteger remainder = null;

		//System.out.println("in the isPrime method:" + num);

		for(BigInteger i: primeSet){
			if(num.mod(i).equals(BigInteger.ZERO)){
				//System.out.println("in the loop" +  i);
				//System.out.println(i.toString());
				return false;
			}
		}

		return true;
	}
}
/*
MY IDEA

divide the number by the numbers that I have already allocated in a Set that i know a re prime, and that will determine whether its prime or not
I will first square root the number and then find any multiples of the number.
*/