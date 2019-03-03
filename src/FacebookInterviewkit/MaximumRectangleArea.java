package FacebookInterviewkit;

import java.util.Stack;

public class MaximumRectangleArea {

    static void calculateMax(int[] arr, int n)
    {
        Stack<Integer> stack = new Stack();
        int i = 0;
        long max = 0;
        int p;
        while(i<n)
        {
            if(stack.empty() || arr[stack.peek()] <= arr[i])
                stack.push(i++);
            else
            {
                p = stack.peek();
                stack.pop();
                long area = arr[p]*(stack.empty()?i:i-stack.peek()-1);
                if(area > max)
                    max = area;
            }
        }

        while (stack.empty() == false)
        {
            p = stack.peek();
            stack.pop();
            long area = arr[p]*(stack.empty()?i:i-stack.peek()-1);
            if(area > max)
                max = area;
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int[] arr = {6, 2, 5, 4, 5, 1, 6};
        int n = arr.length;
        calculateMax(arr,n);
    }
}
