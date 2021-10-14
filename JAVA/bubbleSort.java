
import java.util.*;

public class bubbleSort {
       public static void main(String[] args) {
          int n, temp;




          ///  taking size of an array  ///
            Scanner sc = new Scanner(System.in);
           System.out.println("Enter the size of an array :- ");
           n=sc.nextInt();




           ////   initializing array   ////
                int[] arr=new int[n];     




         ///  Taking array input  ///  
        System.out.println("Enter "+n+" numbers :- ");
        for(int i=0 ; i<n; i++) {
            arr[i]=sc.nextInt();
        }



        
        ///  sorting the array  ///
      for(int i=0 ; i<n ;i++) {
        int flag=0;
            for(int j=0 ; j<n-i-1; j++) {
                if(arr[j]>arr[j+1]) {
                     temp=arr[j];
                      arr[j]=arr[j+1];
                      arr[j+1]=temp;
                      flag=1;
                }
            }
            if(flag==0) {
               break;
            }
      }




        ///  printing sorted array  ///
        System.out.println("The sorted array is :- ");
        for(int i=0;i<n;i++) {
         System.out.println(arr[i]+" ");
        }
        



       }
}
