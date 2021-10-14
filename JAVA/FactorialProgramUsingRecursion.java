//Factorial Program using Recursion
//Vinayak Mali

import java.util.Scanner;

public class FactorialProgramUsingRecursion {

    public static int Factorial(int n){
        if(n==1){
            return 1;
        }
        return n * Factorial(n-1);
    }

    public static void main(String[] args) {
        int n,factorial;
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter number to calculate Factorial : ");
        n = input.nextInt();
        factorial = Factorial(n);
        System.out.println("Factorial of "+ n + " is " + factorial);
    }
}
