package com.koolearn.thought.ChapterThree;

/**
 * @author : linwengang
 * create at:  2020/11/15  06:38
 * @description:练习3：（1）创建一个包含一个float域的类，并用这个方法展示方法调用时别名的机制
 */
public class QuestionsThree {
    static void f(Letter y){
        y.c=2.22f;
    }
    public static void main(String[] args){
        Letter s = new Letter();
        s.c = 1.11f;
        System.out.println("s.c="+s.c);
        f(s);
        System.out.println("s.c="+s.c);
    }
}
class Letter{
    Float c;
}
