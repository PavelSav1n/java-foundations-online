package ru.itsjava.encryption;

import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;

public class MD5HashingEncryption {

    /* Driver Code */
    public static void main(String[] args) {

        /* Plain-text password initialization. */
        String password = "myPassword"; // deb1536f480475f7d593219aa1afd74c
//        String password2 = "myPassword2"; // 8ff9406be0e00f91d777b3aa2a198bf0
        String encryptedpassword = null;
        try {
            /* MessageDigest instance for MD5. */
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");

            /* Add plain-text password bytes to digest using MD5 update() method. */
            messageDigest.update(password.getBytes());

            /* Convert the hash value into bytes */
            byte[] bytes = messageDigest.digest();

            for (int i = 0; i < bytes.length; i++) {
                System.out.println("bytes[" + i + "] = " + bytes[i]);
            }

            /* The bytes array has bytes in decimal form. Converting it into hexadecimal format. */
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                stringBuilder.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }

            System.out.println("stringBuilder = " + stringBuilder);

            /* Complete hashed password in hexadecimal format */
            encryptedpassword = stringBuilder.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        /* Display the unencrypted and encrypted passwords. */
        System.out.println("Plain-text password: " + password);
        System.out.println("Encrypted password using MD5: " + encryptedpassword);
    }

}
