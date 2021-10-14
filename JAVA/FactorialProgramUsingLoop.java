//Factorial Program using For Loop
//Vinayak Mali

import java.util.Scanner;

public class FactorialProgramUsingLoop {
    public static void main(String[] args) {
        int n,i,factorial=1;
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter number to calculate Factorial : ");
        n= input.nextInt();
        for(i=2;i<=n;i++){
            factorial = factorial * i;
        }
        System.out.println("Factorial of "+ n + " is " + factorial);
    }
}
