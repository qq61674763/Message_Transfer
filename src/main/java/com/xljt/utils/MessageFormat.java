package com.xljt.utils;

import org.springframework.stereotype.Service;

import java.math.BigInteger;

/**
 * @author : XU <br>
 * @version : 1.0 <br>
 * @description : messageFormat <br>
 * @date : 2019/9/12 15:20 <br>
 */
public class MessageFormat {

    /**
     * 将16进制转换成字符串
     *
     * @param s 十六进制数值
     * @return 解析完成的字符串
     */
    public static String numberToString(String s) {
        byte[] baKeyword = new byte[s.length() / 2];
        for (int i = 0; i < baKeyword.length; i++) {
            try {
                baKeyword[i] = (byte) (0xff & Integer.parseInt(s.substring(
                        i * 2, i * 2 + 2), 16));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            s = new String(baKeyword, "utf-8");
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        return s;
    }


    /**
     * 将字符串转换为16进制数值
     *
     * @param str
     * @return
     */
    public static String stringToNumber(String str) {
        char[] chars = "0123456789ABCDEF".toCharArray();
        StringBuilder sb = new StringBuilder("");
        byte[] bs = str.getBytes();
        int bit;
        for (int i = 0; i < bs.length; i++) {
            bit = (bs[i] & 0x0f0) >> 4;
            sb.append(chars[bit]);
            bit = bs[i] & 0x0f;
            sb.append(chars[bit]);
        }
        return sb.toString().trim();
    }


    /**
     * 将16进制转换为10进制
     *
     * @param hexs
     * @return
     */
    public static String numberToInt(String hexs) {
        BigInteger bigint = new BigInteger(hexs, 16);
        int number = bigint.intValue();
        return String.valueOf(number);
    }

    /**
     * 将10进制数值转换为16进制
     *
     * @param number
     * @return
     */
    public static String intToNumber(int number) {
        String hex = Integer.toHexString(number);
        return hex;
    }

}
