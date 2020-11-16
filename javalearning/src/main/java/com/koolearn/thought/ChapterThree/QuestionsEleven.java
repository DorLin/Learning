package com.koolearn.thought.ChapterThree;

/**
 * @author : linwengang
 * create at:  2020/11/15  15:21
 * @description:练习11：（3）以一个最高有效位为1的二进制数字开始（提示：使用十六进制常量），用有符号右移操作符对其进行
 * 右移，直至所有的二进制位都被移出为止，每移一位都要使用Integer.toBinaryString()显示结果
 * 练习12：（3）以一个所有位都是1的二进制数字开始，先左移它，然后用无符号右移操作符对其进行右移，直至所有的二进制位都被移出
 * 为止，每移一位都要使用Integer.toBinaryString()显示结果
 */
public class QuestionsEleven {
    public static void main(String[] args) {
        int h = 0x10000000;
        System.out.println(Integer.toBinaryString(h));
        for(int i = 0; i < 29; i++) {
            h >>>= 1;
            System.out.println(Integer.toBinaryString(h));
        }
        System.out.println("-----------end1----------------------");

        h=0xffffffff;
        System.out.println(Integer.toBinaryString(h));
        for(int i = 0; i < 3; i++) {
            h <<= 1;
            System.out.println(Integer.toBinaryString(h));
        }
        System.out.println("-------------end2--------------------");
        for(int i = 0; i < 32; i++) {
            h >>>= 1;
            System.out.println(Integer.toBinaryString(h));
        }
    }

}
