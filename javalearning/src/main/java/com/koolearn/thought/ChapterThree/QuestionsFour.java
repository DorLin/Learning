package com.koolearn.thought.ChapterThree;

import static net.mindview.util.Print.print;

/**
 * @author : linwengang
 * create at:  2020/11/15  07:28
 * @description:练习4：（2）编写一个计算速度的程序，他所使用的距离和时间都是常量
 */
public class QuestionsFour {
    public static double speedArithmetic(){
        final double DISTANCE = 10;
        final double TIME = 3;
        double speed = DISTANCE/TIME;
        return speed;
    }

    public static void main(String[] args) {

        print(speedArithmetic());
    }
}
