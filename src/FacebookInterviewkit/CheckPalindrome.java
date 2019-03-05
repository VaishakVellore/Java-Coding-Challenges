package FacebookInterviewkit;

public class CheckPalindrome {

    static void checkPalindrome(String str)
    {
        str = str.replace(" ","");
        int length = str.length();
        boolean isPalindrome = true;
        for(int i=0; i<length/2; i++)
        {
            if(str.charAt(i) != str.charAt(length-i-1)) {
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome)
            System.out.println("String is a Palindrome");
        else
            System.out.println("String is not a Palindrome");
    }

    public static void main(String[] args) {
        String str = "race car";
        checkPalindrome(str);
    }
}
