package euler.solutions;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class Problem10 {

	public Problem10() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem10 instance = new Problem10();
		
		instance.getBigPrimeNum(args[0]);
	}
	
	public void getBigPrimeNum(String max){
		Set<BigInteger> primeSet = new HashSet<BigInteger>();
		BigInteger num = BigInteger.ONE.add(BigInteger.ONE);
		BigInteger result = null;
		BigInteger maximum = new BigInteger(max);

		BigInteger temp = num;
		//System.out.println("In BigInteger method");

		while(temp.max(maximum) == maximum){
			if(temp.equals(BigInteger.ONE.add(BigInteger.ONE))){
				primeSet.add(num);
				System.out.println(temp.toString());
			} else if(isPrime(temp, primeSet)){
				primeSet.add(temp);
				System.out.println(temp.toString());
				//System.out.println("Adding " + temp.toString() +  " to Set");
			}
			
			temp = temp.add(BigInteger.ONE);
			
			
			//System.out.println("temp = " + temp.toString());
		}
		
		getSum(primeSet);
		
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
	
	public void getSum(Set<BigInteger> primeSet){
		BigInteger value = BigInteger.ZERO;
		
		for(BigInteger y: primeSet){
			value = y.add(value);
		}
		
		System.out.println(value.toString());
	}

}
