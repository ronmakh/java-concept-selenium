package Assignment1;

public class Assignment1 {
	public double areaOfSquare(double length) {
		return length*length;
	}
	
	public double areaOfTriangle(double length, double height) {
		return 0.5*length*height;
	}
	
	public void multiplyThree(int size) {
		for(int i=1; i<=size; i++) {
			int result = 3*i;
			System.out.println("3 x " + i + " = " + result);
			
		}
	}
	
	public static void main(String[] args) {
		
		Assignment1 obj = new Assignment1();
		
		double res1 = obj.areaOfSquare(45.9);
		double res2 = obj.areaOfTriangle(25, 1);
		
		System.out.println(res1);
		System.out.println(res2);
		
		obj.multiplyThree(5);
		
		double rand = Math.random();
		System.out.println(rand);
	}

}
