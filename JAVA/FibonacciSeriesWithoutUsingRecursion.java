//Vinayak Mali
//Fibonacci Series without using recursion

import java.util.Scanner;

public class FibonacciSeriesWithoutUsingRecursion {
    public static void main(String[] args) {
        int n,i,sum=1,n1,n2;
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter size of Fibonacci Series : ");
        n = input.nextInt(); 
        n1=0;
        n2=1;
        System.out.print("\n0 1 ");
        for(i=3;i<=n;i++){
            sum=n1+n2;
            n1=n2;
            n2=sum;
            System.out.print(sum + " ");
        }
    }
}
