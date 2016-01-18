package pt.jaybee.moldes.service.utils.security;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordEncrypt {

    public PasswordEncrypt() {
    }

    public String encrypt(String originalPassword) {

        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(originalPassword.getBytes());
            byte[] byteData = md.digest();

            StringBuffer sb = new StringBuffer();

            for (byte b : byteData) {
                sb.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean check(String enteredPassword, String encryptedPassword) {
        return (encryptedPassword.equals(encrypt(encryptedPassword)));
    }
}
