package cubeandsqure;

import java.util.Scanner;

public class CubeandSquare 
{
	
	public static void main(String[] args) {
		Double input;
		Scanner takevalue=new Scanner(System.in);
		System.out.println("Enter the value you Want Square Root And Cube Root:");
		
		 input=takevalue.nextDouble();
		
		  Double squre= Math.sqrt(input);
		  Double cubeRoot= Math.cbrt(input);
		  
		  System.out.println("Square Root:"+squre);
		  System.out.println("Cube Root:"+cubeRoot);
		
	}

	

}
