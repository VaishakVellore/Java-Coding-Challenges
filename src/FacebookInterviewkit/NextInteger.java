package FacebookInterviewkit;

import java.util.Arrays;

public class NextInteger {
    public static void main(String[] args) {
        System.out.print("Next Integer: " + Arrays.toString(nextInteger(new int[]{9, 9, 8})));
    }

    private static int[] nextInteger(int[] input) {
        if (input.length == 0) {
            return input;
        }
        int sum;
        int carry = 1;
        for (int i = input.length - 1; i >= 0 && carry != 0; i--) {
            sum = input[i] + carry;
            input[i] = sum > 9 ? sum - 10 : sum;
            carry = sum > 9 ? 1 : 0;
        }
        if (carry == 0) {
            return input;
        }
        int[] result = new int[input.length + 1];
        result[0] = carry;
        System.arraycopy(input, 0, result, 1, input.length);
        return result;
    }
}
