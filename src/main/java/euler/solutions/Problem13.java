package euler.solutions;

import java.math.BigInteger;

public class Problem13 {
	
	public int arrayLength = 0;
	public int indexLength = 0;
	
	public Problem13() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem13 instance = new Problem13();
		instance.arrayLength = args.length;
		instance.indexLength = instance.arrayLength - 1;
		System.out.println(instance.solution(args));
		
		
		//System.out.println(args.length);
	}
	
	public String solution(String[] array){
		BigInteger sum = new BigInteger("0");
		String sumString = "";
		String result = "";

		sum = sum.add(calculate(array));
		System.out.println("");
		sumString = sum.toString();
		
		result = sumString.substring(0, 11);
		
		return result;
	}
	
	public String[] splitArray(String[] array, int startPos, int endingPos){
		String[] result = new String[array.length/2];
		int counter = 0;
		for(int i = startPos; i < endingPos; i++){
			result[counter] = array[i];
			counter++;
		}
		
		return result;
	}
	
	public BigInteger calculate(String[] array){
		BigInteger sum = new BigInteger("0");
		
		for(String str: array){
			if(str != null){
				sum = sum.add(new BigInteger(str));
				System.out.println("sum:" + sum.toString());
			} else{
				System.out.println("null String");
			}
		}
		
		return sum;
	}
	
}
