
import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {

        //If there are elements from 1 to N only then cyclic sort is applicable
        int arr[]=new int[]{5,4,3,2,1};

        CyclicSort obj=new CyclicSort();
        System.out.println(Arrays.toString(obj.cycle(arr)));
    }
    int [] cycle(int arr[]){

        int i=0;
        while(i<arr.length){

            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else
                i++;
        }
    return arr;
    }
    int[] swap(int [] arr,int a,int b){

        int temp;
        temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    return arr;
    }
}
