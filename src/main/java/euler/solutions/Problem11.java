package euler.solutions;

import java.util.ArrayList;
import java.util.List;

public class Problem11 {

	public Problem11() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		Problem11 instance = new Problem11();
		
		instance.getProduct(args);
	}
	
	public void getProduct(String[] numbers){
		int i = numbers.length;
		long max = 0;
		
		Integer[][] index = null;
		
		index = initArray(numbers);
		
		System.out.println();
		
		long result = getDiagonal(index);
		max = Math.max(result, max);
		result = getVertical(index);
		max = Math.max(result, max);
		result = getHorizontal(index);
		max = Math.max(result, max);
		
		System.out.println(max);
	}
	
	private long getHorizontal(Integer[][] index) {
		// TODO Auto-generated method stub
		long result = 0;
		long max = 0;
		
		for(int x = 0; x < 17; x++){
			for(int y = 0; y < 17; y++){
				result = index[x][y] * index[x][y+1] * index[x][y+2] * index[x][y+3];
				max = Math.max(max, result);
			}
		}
		return max;
	}

	private long getVertical(Integer[][] index) {
		// TODO Auto-generated method stub
		long result = 0;
		long max = 0;
		
		for(int x = 0; x < 17; x++){
			for(int y = 0; y < 17; y++){
				result = index[y][x] * index[y+1][x] * index[y+2][x] * index[y+3][x];
				max = Math.max(max, result);
			}
		}
		
		return max;
	}

	public long getDiagonal(Integer[][] index){
		long max = Math.max(leftDiagonal(index), rightDiagonal(index));
		//rightDiagonal(index);
		max = Math.max(topDiagonal(index), max);
		return max;
	}
	
	public long leftDiagonal(Integer[][] index){
		long max = 0;
		System.out.println("----------start---leftDiagonal---- " );
		for(int x = 0; x < 17; x++){
			List<Integer> array = new ArrayList<Integer>();
			for(int y = 0; y < 17-x; y++){
				/*for(int i = 0; i < 5; i++){
					
				}*/
				System.out.println(index[x+y][0+y]);
				array.add(index[x+y][0+y]);
			}
			System.out.println("---------------------------------------------");
			
			for(int i = 0; i < array.size()-3; i++){
				long result = array.get(i) * array.get(i+1) * array.get(i+2) * array.get(i+3);
				max = Math.max(max, result);
			}
			
		}
		
		System.out.println("The max is " + max);
		System.out.println("----------end--leftDiagonal---- " );
		return max;
	}
	
	public long rightDiagonal(Integer[][] index){
	long max = 0;
	System.out.println("----------start---rightDiagonal---- " );
		for(int x = 0; x < 17; x++){
			List<Integer> array = new ArrayList<Integer>();
			for(int y = 0; y < 17-x; y++){
					/*for(int i = 0; i < 5; i++){
					
					}*/
				System.out.println("x:" + x + " y:" + y);
				System.out.println(index[x+y][19-y]);
				array.add(index[x+y][19-y]);
			}
			System.out.println("---------------------------------------------");
			
			for(int i = 0; i < array.size()-3; i++){
				System.out.println("product of  : "+ array.get(i) + ":"+  array.get(i+1)  + ":"+  array.get(i+2)  + ":"+  array.get(i+3));
				long result = array.get(i) * array.get(i+1) * array.get(i+2) * array.get(i+3);
				max = Math.max(max, result);
			}
		
		}
		
		System.out.println("The max is " + max);
		System.out.println("----------end--rightDiagonal---- " );
		return max;
	}
	
	public long topDiagonal(Integer[][] index){
		long max = 0;
		
		for(int x = 0; x < 17; x++){
			List<Integer> array = new ArrayList<Integer>();
			for(int y = 0; y < 17-x; y++){
				System.out.println("x:" + x + " y:" + y);
				System.out.println(index[y][y+x]);
				array.add(index[y][y+x]);
			}
			
			for(int i = 0; i < array.size()-3; i++){
				System.out.println("product of  : "+ array.get(i) + ":"+  array.get(i+1)  + ":"+  array.get(i+2)  + ":"+  array.get(i+3));
				long result = array.get(i) * array.get(i+1) * array.get(i+2) * array.get(i+3);
				max = Math.max(max, result);
			}
		}
		System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_---_-_---_-_");
		System.out.println("doing it.........");
		for(int x = 0; x < 17; x++){
			List<Integer> array = new ArrayList<Integer>();
			System.out.println("in the for loop");
			for(int y = 0; y < 17-x; y++){
				array.add(index[x+y][19-y]);
				System.out.println("x:" + x + " y:" + y);
				System.out.println(index[x+y][19-y]);
			}
			
			for(int i = 0; i < array.size()-3; i++){
				System.out.println("product of  : "+ array.get(i) + ":"+  array.get(i+1)  + ":"+  array.get(i+2)  + ":"+  array.get(i+3));
				long result = array.get(i) * array.get(i+1) * array.get(i+2) * array.get(i+3);
				max = Math.max(max, result);
			}
		}
		
		return max;
	}
	
	public Integer[][] initArray(String[] numbers){
		System.out.println(numbers.length);
		int counter = 0;
		
		Integer[][] index = new Integer[(int) Math.sqrt(numbers.length)][(int) Math.sqrt(numbers.length)];
		
		for(int i = 0; i < Math.sqrt(numbers.length); i++){
			for(int x = 0; x < Math.sqrt(numbers.length); x++){
				index[i][x] = Integer.parseInt(numbers[counter]);
				counter++;
			}
		}
		
		return index;
	}

}
