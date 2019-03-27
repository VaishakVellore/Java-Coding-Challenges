package Walmart_Interviewkit;

public class SubStringProblem {

    static void isSubString(String s1, String s2)
    {
        int count = 0;
        boolean isStr = false;

        for(int i = 0; i<s1.length(); i++)
        {
            if(s1.charAt(i) == s2.charAt(count))
                count++;
            else
                count = 0;

            if(count == s2.length()) {
               isStr = true;
               break;
            }
        }
        if(isStr)
            System.out.println("Substring found");
        else
            System.out.println("Substring not found");
    }

    public static void main(String[] args) {
        String s1 = "GeeksforGeeks";
        String s2 = "Geks";

        isSubString(s1,s2);
    }
}
