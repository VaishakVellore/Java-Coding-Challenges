package Algorithms_LeetCode;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for( int i = 0; i < nums.length; i++)
        {
            map.put(nums[i], i);
        }
        for( int i = 0; i < nums.length; i++)
        {
            int complement = target - nums[i];
            if(map.containsKey(complement) && map.get(complement)!= i)
                return new int[] {i,map.get(complement)};
        }
        throw new IllegalArgumentException(" No two sum solution");
    }

    public static String integerArrayToString(int[] nums, int length) {
        if (length == 0) {
            return "[]";
        }

        String result = "";
        for(int index = 0; index < length; index++) {
            int number = nums[index];
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }

    public static String integerArrayToString(int[] nums) {
        return integerArrayToString(nums, nums.length);
    }

    public static void main(String[] args)
    {
        //Scanner in = new Scanner(System.in);
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        String out = integerArrayToString(result);
        System.out.println(out);
    }
}
