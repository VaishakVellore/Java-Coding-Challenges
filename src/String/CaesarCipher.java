package String;

import java.util.Scanner;

public class CaesarCipher {
	
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		String str = in.nextLine();
		int rotate = in.nextInt()%26;
		StringBuffer sb = new StringBuffer(str);
		int num = 0;
		
		for( int i = 0; i<n; i++)
		{
			num = 0;
			char ch = str.charAt(i);
			if((int)ch >=65 && (int)ch <=90)
			{
				num = (int)ch + rotate;
				if(num >90)
					num = 64+num-90;
				sb.setCharAt(i, (char)num);
			}
			if((int)ch >= 97 && (int)ch <= 122)
			{
				num = (int)ch + rotate;
				if(num>122){
					num=96+num-122;
				}
				
				sb.setCharAt(i, (char)num);
			}
		}
		System.out.println(sb);
	}
}
