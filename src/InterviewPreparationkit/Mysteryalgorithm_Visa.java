package InterviewPreparationkit;

public class Mysteryalgorithm_Visa {
    public static void main(String[] args) {
        int a = 2437, b = 875;
        int x = a;
        int y = b;
        int result = 0;
        for(int i = 0; i<1000000; i++)
        {
            if(x > y)
                x = x - y;
            else if( x < y)
                y = y - x;
            else if ( x == y)
            {
                break;

            }

        }
        result = x;
        System.out.println(result);

    }
}
