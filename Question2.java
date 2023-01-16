// 2. Design method public int getNumberCube(int num), 
// return int value to that method and result should be into main method.




import java.util.Scanner;

public class Question2 {
	
	public static int getNumberCube(int num) // creating method 
	{
		
		@SuppressWarnings("unused")
		int output = num*num*num; // logic for the calculating the cube of the number or input 
		
		return output;	
		
	}
	
	public static void main(String[] args) {
	

	Scanner sc = new Scanner(System.in); // create the Scanner class object
	
	System.out.println("Enter the Number :"); // print Statement 
		
	int number = sc.nextInt(); // in number storing the result or value enter by user
	
	int output = getNumberCube(number); // calling the cube method which is create with name getNumberCube
	
	System.out.println("Cube of "+ number+ ":" +  output);
	
	
	
		
	}

}
