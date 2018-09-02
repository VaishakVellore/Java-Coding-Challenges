package InterviewPreparationkit;

import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.spec.IvParameterSpec;

class AES{
    static final String cipher_type = "AES/CBC/PKCS5Padding";

    public static void main(String[] args) {
        String key  = "6372696d65000000000000000000000000000000000000000000000000000000";
        String iv   = "0000000000000000";
        String data = "message";

        byte[] enc = encode(key, iv, data.getBytes());
        byte[] dec = decode(key, iv, "62424555475a4170646e3941577333714b65472b69513d3d".getBytes());

        for (int i = 0; i < enc.length; i++) {
            System.out.printf("%02x", enc[i]);
        }
        System.out.println();

        System.out.println(new String(dec));
    }

    public static byte[] encode(String skey, String iv, byte[] data) {
        return process(Cipher.ENCRYPT_MODE, skey, iv, data);
    }

    public static byte[] decode(String skey, String iv, byte[] data) {
        return process(Cipher.DECRYPT_MODE, skey, iv, data);
    }

    private static byte[] process(int mode, String skey, String iv, byte[] data) {
        SecretKeySpec key = new SecretKeySpec(skey.getBytes(), "AES");
        AlgorithmParameterSpec param = new IvParameterSpec(iv.getBytes());
        try {
            Cipher cipher = Cipher.getInstance(cipher_type);
            cipher.init(mode, key, param);
            return cipher.doFinal(data);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

}