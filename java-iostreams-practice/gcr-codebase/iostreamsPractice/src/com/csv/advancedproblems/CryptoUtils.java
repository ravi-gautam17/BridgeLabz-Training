package com.csv.advancedproblems;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

/*
 * Utility class for AES encryption & decryption
 */
public class CryptoUtils {

    private static final String ALGORITHM = "AES";
    private static final String SECRET_KEY = "MySecretKey12345"; // 16 chars

    public static String encrypt(String data) {
        try {
            SecretKeySpec key = new SecretKeySpec(SECRET_KEY.getBytes(), ALGORITHM);
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, key);

            byte[] encrypted = cipher.doFinal(data.getBytes());
            return Base64.getEncoder().encodeToString(encrypted);

        } catch (Exception e) {
            throw new RuntimeException("Encryption failed", e);
        }
    }

    public static String decrypt(String encryptedData) {
        try {
            SecretKeySpec key = new SecretKeySpec(SECRET_KEY.getBytes(), ALGORITHM);
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, key);

            byte[] decoded = Base64.getDecoder().decode(encryptedData);
            return new String(cipher.doFinal(decoded));

        } catch (Exception e) {
            throw new RuntimeException("Decryption failed", e);
        }
    }
}

