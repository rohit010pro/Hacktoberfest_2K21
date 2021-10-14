//Vinayak Mali
//Fibonacci Series using recursion

import java.util.Scanner;

public class FibonacciSeriesUsingRecursion {
    static int n,n1=0,n2=1,sum;

    public static void Fibonacci(int n){
        if(n>0){
            sum=n1+n2;
            n1=n2;
            n2=sum;
            System.out.print(sum + " ");
            Fibonacci(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter size of Fibonacci Series : ");
        n = input.nextInt();
        System.out.print("\n0 1 ");
        Fibonacci(n-2);
    }
}
