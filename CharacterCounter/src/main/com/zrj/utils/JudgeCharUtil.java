package com.zrj.utils;

/**
 * Created by yeluo on 2/8/17.
 */
public class JudgeCharUtil {
    /*
     * 判断是否为空字符
     */
    public static boolean isSpaceChar(char c) {
        return Character.isSpaceChar(c);
    }

    /*
     * 判断是否为数字
     */
    public static boolean isDigit(char c) {
        return Character.isDigit(c);
    }

    public static boolean isEnglishChar(char c) {
        return ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'));
    }

    /*
     * 判断是否为汉字
     */
    public static boolean isChineseChar(char c) {
        Character.UnicodeBlock ub = Character.UnicodeBlock.of(c);
        return (ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS ||
                ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A ||
                ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B ||
                ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C ||
                ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D ||
                ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS ||
                ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT);
    }

    /*
     * 判断是否为标点符号
     */
    public static boolean isSymbol(char ch) {
        if(isCnSymbol(ch)) return true;
        if(isEnSymbol(ch))return true;

        if(0x2010 <= ch && ch <= 0x2017) return true;
        if(0x2020 <= ch && ch <= 0x2027) return true;
        if(0x2B00 <= ch && ch <= 0x2BFF) return true;
        if(0xFF03 <= ch && ch <= 0xFF06) return true;
        if(0xFF08 <= ch && ch <= 0xFF0B) return true;
        if(ch == 0xFF0D || ch == 0xFF0F) return true;
        if(0xFF1C <= ch && ch <= 0xFF1E) return true;
        if(ch == 0xFF20 || ch == 0xFF65) return true;
        if(0xFF3B <= ch && ch <= 0xFF40) return true;
        if(0xFF5B <= ch && ch <= 0xFF60) return true;
        if(ch == 0xFF62 || ch == 0xFF63) return true;
        if(ch == 0x0032 || ch == 0x3000) return true;
        return false;

    }
    public static boolean isCnSymbol(char ch) {
        if (0x3004 <= ch && ch <= 0x301C) return true;
        if (0x3020 <= ch && ch <= 0x303F) return true;
        return false;
    }
    public static boolean isEnSymbol(char ch){

        if (ch == 0x40) return true;
        if (ch == 0x2D || ch == 0x2F) return true;
        if (0x23 <= ch && ch <= 0x26) return true;
        if (0x28 <= ch && ch <= 0x2B) return true;
        if (0x3C <= ch && ch <= 0x3E) return true;
        if (0x5B <= ch && ch <= 0x60) return true;
        if (0x7B <= ch && ch <= 0x7E) return true;

        return false;
    }

    public static boolean isPunctuation(char ch){
        if(isCjkPunc(ch)) return true;
        if(isEnPunc(ch)) return true;

        if(0x2018 <= ch && ch <= 0x201F) return true;
        if(ch == 0xFF01 || ch == 0xFF02) return true;
        if(ch == 0xFF07 || ch == 0xFF0C) return true;
        if(ch == 0xFF1A || ch == 0xFF1B) return true;
        if(ch == 0xFF1F || ch == 0xFF61) return true;
        if(ch == 0xFF0E) return true;
        if(ch == 0xFF65) return true;

        return false;
    }
    public static boolean isEnPunc(char ch){
        if (0x21 <= ch && ch <= 0x22) return true;
        if (ch == 0x27 || ch == 0x2C) return true;
        if (ch == 0x2E || ch == 0x3A) return true;
        if (ch == 0x3B || ch == 0x3F) return true;

        return false;
    }
    public static boolean isCjkPunc(char ch){
        if (0x3001 <= ch && ch <= 0x3003) return true;
        if (0x301D <= ch && ch <= 0x301F) return true;

        return false;
    }
}
