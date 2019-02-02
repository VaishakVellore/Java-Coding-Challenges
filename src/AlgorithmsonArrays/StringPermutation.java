package AlgorithmsonArrays;

public class StringPermutation {

    static void permute(String str, int l, int r)
    {
        if(l == r)
            System.out.println(str);
        else
        {
            for( int i =l; i<=r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    }

    static String swap(String a, int i, int j)
    {
        char temp;
        char[] temparray = a.toCharArray();
        temp = temparray[i];
        temparray[i] = temparray[j];
        temparray[j] = temp;

        return String.valueOf(temparray);
    }

    public static void main(String[] args) {
        String str = "ABC";
        int n = str.length();
        permute(str,0,n-1);
    }
}
