import java.util.Stack;

public class LargestRectangleInHistogram {
    public int largestRectangleArea(int[] heights) {
        int[] NSR = NSR(heights);
        int[] NSL = NSL(heights);
        int max_area = Integer.MIN_VALUE;
        int result[] = new int[heights.length];
        for(int i = 0;i<heights.length;i++){
            result[i] = NSR[i]-NSL[i]-1;
            max_area = Math.max(result[i]*heights[i],max_area);
        }
        return max_area;
        
        
    }
    public int[] NSR(int[] heights){
        Stack<Integer> stack = new Stack<>();
        int n = heights.length;
        int[] result = new int[n];
        result[n-1] = n;
        stack.push(n-1);
        for(int i = n-1;i>=0;i--){
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                result[i] = n;
            }else{
                result[i] = stack.peek();
            }
            stack.push(i);
        }
        return result;
    }
    public int[] NSL(int[] heights){
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[n];
        result[0] = -1;
        stack.push(0);
        for(int i = 1;i<n;i++){
            while(!stack.isEmpty()&& heights[stack.peek()]>=heights[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                result[i] = -1;
            }else{
                result[i] = stack.peek();
            }
            stack.push(i);
        }
        return result;
    }
}
