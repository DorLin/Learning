package com.koolearn.thought.ChapterThree;

/**
 * @author : linwengang
 * create at:  2020/11/14  22:59
 * @description:
 */
public class Precedence {
    public static void main(String[] args){
        int x=1,y=2,z=3;
        int a=x+y-2/2+z;
        int b=x+(y-2)/(2+z);
//        "+"后面为非String类型时，会尝试将其转换为String与前面的String链接起来，ps：
        System.out.println("a="+a+"  b="+b);
    }
}
