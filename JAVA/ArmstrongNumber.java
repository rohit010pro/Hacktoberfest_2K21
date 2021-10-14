//Armstrong Number
//Vinayak Mali

import java.util.Scanner;

public class ArmstrongNumber {

    public static int Exponent(int count,int n){
        int i,expo=1;
        for(i=0;i<count;i++){
            expo=expo*n;
        }
        return expo;
    }

    public static int Armstrong(int n){
        int count=0,yes=0,i,temp=n,number=0;
        while(temp!=0){
            temp = temp/10;
            count++;
        }
        temp = n;
        while(temp!=0){
            number = number + Exponent(count,temp%10);
            temp=temp/10;
        }
        if ( number == n){
            yes = 1;
        }
        return yes;
    }

    public static void main(String[] args) {
        int n,yes;
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the number to check whether the number is Armstrong Number or not : ");
        n = input.nextInt();
        yes = Armstrong(n);
        if(yes == 1){
            System.out.println("Number " + n + " is Armstrong Number");
        }
        else{
            System.out.println("Number " + n + " is NOT Armstrong Number");
        }

    }
}
