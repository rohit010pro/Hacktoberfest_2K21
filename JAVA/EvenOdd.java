import java.util.Scanner;
public class EvenOdd{

	public static void main(String[]args){
	int num,remainder;
	Scanner s = new Scanner(System.in);

	System.out.print("Enter a number:");
	num = s.nextInt();
	
	remainder=num%2;

	if(remainder==0){
		System.out.println("You entered an even number.");
	}

		else{
			System.out.println("You entered an odd number");
		}
	}
}
	
	
	
