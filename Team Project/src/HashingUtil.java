package GroupProject;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashingUtil {

    public static String hashPassword(String plainTextPassword) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(plainTextPassword.getBytes(StandardCharsets.UTF_8));

            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            // Handle the exception appropriately in your application
            return null;
        }
    }

    public static boolean verifyPassword(String plainTextPassword, String hashedPassword) {
        return hashPassword(plainTextPassword).equals(hashedPassword);
    }
}

