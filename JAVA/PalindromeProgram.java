//Palindrome Number Program
//Vinayak Mali

import java.util.Scanner;

public class PalindromeProgram {
    public static void main(String[] args) {
        int number,i=0,reverse=0,temp,remainder;
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the number to check whether the number is palindrome or not : ");
        number = input.nextInt();
        temp = number;
        while(temp!=0){
            remainder = temp%10;
            reverse = (reverse*10) + remainder;
            temp = temp/10;
        }
        if(reverse==number){
            System.out.println("yes");
        }
        else {
            System.out.println("No");
        }

    }
}
