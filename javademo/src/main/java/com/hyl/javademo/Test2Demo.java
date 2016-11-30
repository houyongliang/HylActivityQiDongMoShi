package com.hyl.javademo;

/**
 * 1. 作用
 * 2. 作者 侯永亮
 * 3. 时间 2016/11/30.
 */

public class Test2Demo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str = "我是中国人,Welcome To China! 123";
        int chCount = 0;
        int digitCount = 0;
        int blankCount = 0;
        int chineseCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
                chCount++;
            }
            if ('0' <= ch && ch <= '9') {
                digitCount++;
            }
            if (ch == ' ') {
                blankCount++;
            }
            if (ch >= 0x0391 && ch <= 0xFFE5) { //中文unicode编码
                System.out.println(ch);
                chineseCount++;
            }
        }
        System.out.println("英文字符数：" + chCount);
        System.out.println("数字字符数：" + digitCount);
        System.out.println("空格数：" + blankCount);
        System.out.println("中文字符数是：" + chineseCount);
    }

}
