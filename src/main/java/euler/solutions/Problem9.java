package euler.solutions;

public class Problem9 {

	public Problem9() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		Problem9 instance = new Problem9();
		
		instance.getTriple();
	}
	
	public void getTriple(){
		int c = 1;
		int a = 0;
		int b = 0;
		boolean foundTriple = false;
		
		for(a = 1; a < 1000/2; a++){
			for(b = 1; b < 1000; b++){
				// calc a^2 + b^2
				int value = (a*a) + (b*b);
				c = (int) Math.sqrt(value);
				if(a + b + c == 1000){
					if(c*c == value){
						foundTriple = true;
						break;
					}
				}
			}
			if(foundTriple)
				break;
		}
		
		System.out.println(a + "," +  b + "," + c);
		
		System.out.println(a*b*c);
	}

}
