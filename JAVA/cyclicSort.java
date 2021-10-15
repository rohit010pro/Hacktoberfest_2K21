import java.util.Arrays;


// for cyclic sort numbers should be in the range 1 to n
public class cyclicSort {
    public static void main(String[] args) {
    	
    	int[] arr = {5, 4, 3, 2, 1};
    	
    	System.out.println(Arrays.toString(sort(arr)));
    	
    }
    
    static int[] sort(int[] arr) {
    	int i=0; 
    	
    	while(i<arr.length) {
    		int correct = arr[i]-1;
    		
    		if(arr[i]!=arr[correct]) {
    			int temp=arr[i];
    			arr[i]=arr[correct];
    			arr[correct]=temp;
    		}
    		else {
    			i++;
    		}
    		 
    	}
    	
    	return arr;
    }
}
