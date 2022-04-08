package edu.studentreport.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author Peter Cheung
 * @date 2022/4/8 20:28
 */
public class MD5Util {
    public static String toMd5(String oldPassword) {
        MessageDigest md5 = null;
        StringBuilder result = new StringBuilder();
        try {
            md5 = MessageDigest.getInstance("MD5");
            byte[] newPassword = md5.digest(oldPassword.getBytes());
            for (byte b : newPassword) {
                String temp = Integer.toHexString(b & 0xff);
                if (temp.length() == 1) {
                    temp = "0" + temp;
                }
                result.append(temp);
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return result.toString();
    }
}
