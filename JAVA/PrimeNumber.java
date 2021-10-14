//Vinayak Mali
//To Check Given Number is Prime or Not

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int n,flag=1;
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the number To Check whether Number is Prime or Not : ");
        n = input.nextInt();
        for(int i=2;i<n;i++){
            if( n%i == 0 ){
                flag=0;
                break;
            }
        }
        if(flag == 1){
            System.out.println(n + " is a prime number");
        }
        else {
            System.out.println(n + " is a NOT prime number");
        }
    }
}
