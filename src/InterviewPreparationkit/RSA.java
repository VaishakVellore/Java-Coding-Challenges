package InterviewPreparationkit;

import java.math.BigDecimal;
import java.math.BigInteger;

public class RSA {
    public static void main(String[] args)
    {
        BigDecimal p = new BigDecimal("320181056072095218868339092717483179170");
        BigDecimal q = new BigDecimal("264515818482660146971535304176490802642");
        BigInteger c = new BigInteger("21698323120385586424573862118808098555103084743518277473544693629498197679429");
        BigInteger n = new BigInteger("84692954109552769374106613978990493265631425360379150170786955314741169348953");
        BigDecimal e = new BigDecimal("65537");

        BigDecimal one = new BigDecimal("1");

        BigDecimal phi = p.multiply(q);
        System.out.println("phi =" +phi);

        BigInteger d = e.toBigInteger().modInverse(phi.toBigInteger());
        System.out.println("d =" +d);

        //BigDecimal d = x.inverse(e,15, RoundingMode.HALF_UP);

        //BigDecimal d = new BigDecimal("42212724811763449831472184348135014762695139936058316009332078035025689864773");

        BigInteger m = c.modPow(d,n);

        System.out.println("m =" +m);
        //System.out.println(BigDecimalMath.pow(c, d).remainder(n));
    }
}