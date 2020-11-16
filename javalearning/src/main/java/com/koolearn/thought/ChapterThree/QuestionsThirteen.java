package com.koolearn.thought.ChapterThree;

/**
 * @author : linwengang
 * create at:  2020/11/15  15:22
 * @description:练习13：（1）编写一个方法，它以二进制形式显示char类型的值，使用多个不同的字符来展示它
 */
public class QuestionsThirteen {
    public static String transform(int  a )
    {
        /***
        int temp,result;
        if(a==1)
            return 1;
        temp=a/2;
//        System.out.println(Integer.toBinaryString(97));
        result=(a%2)+transform(temp)*10;
//        return result;
         ***/
        return Integer.toBinaryString(a);
    }

    private static String getType(Object a) {
        return a.getClass().toString();

    }

    public static void main(String[] args) {
        char[] chars="abcdefghijklmnopqrstuvwxyz`!@#$%^&*()_+`-=1234567890{}[]|\\:'<.,>/?".toCharArray();
        for(int i=0;i<=chars.length-1;i++){
            System.out.println(chars[i]+"="+transform(chars[i]));
//            System.out.println(getType(chars[i]));
        }
    }

}
