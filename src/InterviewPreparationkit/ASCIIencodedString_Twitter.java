package InterviewPreparationkit;

public class ASCIIencodedString_Twitter {

    public static String decode(String encoded) {
        // Write your code here
        String result = "";
        String str = new StringBuilder(encoded).reverse().toString();

        for(int i = 0; i< str.length(); i++)
        {
            //if((str.charAt(i) + str.charAt(i+1) >= 65) && (str.charAt(i) + str.charAt(i+1) <= 90))


        }


        return result;
    }

    public static void main(String[] args) {
        String str = "23511011501782351112179911801562340161171141148";
        System.out.println(decode(str));
    }
}
