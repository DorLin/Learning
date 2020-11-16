package com.koolearn.thought.ChapterThree;

import java.util.Random;
import java.util.Scanner;

/**
 * @author : linwengang
 * create at:  2020/11/15  11:37
 * @description:练习7：（3）编写一个程序，模拟扔硬币的结果。
 */
public class QuestionsSeven {
    public static void main(String[] args) {
//        Random rand = new Random();
        System.out.print("请输入任意一个整数后，按回车进行投币：");
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        if (t%2==0){
            System.out.println("正面");
        }else {
            System.out.println("反面");
        }
    }

}
