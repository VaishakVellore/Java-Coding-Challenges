package Algorithms_LeetCode;

public class IntegerPalindrome {

    static void palindromeInt(int x)
    {
        int number = x;
        if( x < 0)
            System.out.println("Not a palindrome");
        long res = 0;
        while(x!=0)
        {
            res = res * 10 + x % 10;
            x = x/10;
        }
        int answer = (int)res;
        if(answer == number)
            System.out.println("The number is a palindrome");
        else
            System.out.println("Not a palindrome");
    }

    public static void main(String[] args) {
        int x = 123;
        palindromeInt(x);
    }
}
