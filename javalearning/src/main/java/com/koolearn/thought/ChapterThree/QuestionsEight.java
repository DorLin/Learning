package com.koolearn.thought.ChapterThree;

import static net.mindview.util.Print.print;

/**
 * @author : linwengang
 * create at:  2020/11/15  12:24
 * @description:练习8：（2）展示用十六进制和八进制计数法来操作long值，用Long.toBinaryString（）来显示结果
 */
public class QuestionsEight {
    public static void main(String[] args) {
        long l1 = 0156L;
        print("l1:"+Long.toBinaryString(l1));
        long l2 = 0x9aL;
        print("l2:"+Long.toBinaryString(l2));

    }
}
