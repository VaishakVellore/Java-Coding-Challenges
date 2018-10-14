package InterviewPreparationkit;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class CompilerProblem_Twitter {

    // Complete the braces function below.
    static Boolean braces(String values) {
        Stack<Character> stack = new Stack<Character>();

        char c;
        for(int i=0; i < values.length(); i++) {
            c = values.charAt(i);

            if(c == '(')
                stack.push(c);
            else if(c == '{')
                stack.push(c);
            else if(c == '[')
                stack.push(c);
            else if(c == ')')
                if(stack.empty())
                    return false;
                else if(stack.peek() == '(')
                    stack.pop();
                else
                    return false;
            else if(c == '}')
                if(stack.empty())
                    return false;
                else if(stack.peek() == '{')
                    stack.pop();
                else
                    return false;
            else if(c == ']')
                if(stack.empty())
                    return false;
                else if(stack.peek() == '[')
                    stack.pop();
                else
                    return false;
        }
        return stack.empty();
    }

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int valuesCount = scanner.nextInt();

        String[] values = new String[valuesCount];

        for (int i = 0; i < valuesCount; i++) {
            String valuesItem = scanner.next();
            values[i] = valuesItem;
        }

        for(String str: values)
        {
            Boolean res = braces(str);
            if(res)
            {
                System.out.println("YES");
            }
            else
                System.out.println("NO");

        }

    }

   /* public static void main(String[] args) {

        Boolean res = braces("{[}]}");
        System.out.println(res);
    }*/
}
