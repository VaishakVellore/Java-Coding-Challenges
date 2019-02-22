package InterviewPreparationkit;

import java.util.Stack;

public class Fidessa_StringMatching {

    public static Boolean stringMatching(String str)
    {
        if(str.length() == 0)
            return false;
        if(str.length() %2 != 0)
            return false;
        if(!Character.isUpperCase(str.charAt(0)))
            return false;

        Stack<Character> stack = new Stack<>();
        //int index = -1;
        for(int i = 0; i< str.length(); i++)
        {
            if(Character.isUpperCase(str.charAt(i)))
                stack.push(str.charAt(i));
            else {
                if (stack.isEmpty())
                    break;
                char topStack = stack.peek();
                topStack = Character.toLowerCase(topStack);
                if (topStack == str.charAt(i)) {
                    //index = i;
                    stack.pop();

                } else
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "";
        boolean output = stringMatching(str);
        if(output)
            System.out.println("The String has Matching Pairs");
        else
            System.out.println("The String has no Matching Pairs");
    }
}
