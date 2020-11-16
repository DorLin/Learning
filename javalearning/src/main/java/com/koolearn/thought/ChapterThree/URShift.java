package com.koolearn.thought.ChapterThree;

import static net.mindview.util.Print.print;

/**
 * @author : linwengang
 * create at:  2020/11/15  14:51
 * @description:
 */
public class URShift {
    public static void main(String[] args) {

        int i = -1;
        //原码取反变反码，反码加1变成补码
        print(Integer.toBinaryString(i));
        i >>>=10;
        print(Integer.toBinaryString(i));
        long l = -1;
        print(Long.toBinaryString(l));
        l >>>=10;
        print(Long.toBinaryString(l));
        short s = -1;
        print(Integer.toBinaryString(s));
        //short、chart类型在移位赋值运算中可能是不对的
        s >>>=10;
        print(Integer.toBinaryString(s));
        s=-1;
        print(Integer.toBinaryString(s>>>10));
        byte b = -1;
        print(Integer.toBinaryString(b));
        b >>>=10;
        print(Integer.toBinaryString(b));
        b = -1;
        print(Integer.toBinaryString(b));
        //short、chart类型在移位赋值运算中可能是不对的
        print(Integer.toBinaryString(b>>>10));
    }
}
