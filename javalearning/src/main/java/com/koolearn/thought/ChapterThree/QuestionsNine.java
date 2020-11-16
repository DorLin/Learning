package com.koolearn.thought.ChapterThree;

/**
 * @author : linwengang
 * create at:  2020/11/15  12:57
 * @description:练习9：（1）分别显示用float和double指数计数法所能表示的最大和最小的数字
 */
public class QuestionsNine {
    public static void main(String[] args) {
        float f1 = -3.40E+38f;
        float f2 = +3.40E+38f;
        System.out.println("f1:"+f1+" ,f2:"+f2);

        double d1 = -1.79E+308d;
        double d2 = +1.79E+308d;
        System.out.println("d1:"+d1+" ,d2:"+d2);
    }
}
