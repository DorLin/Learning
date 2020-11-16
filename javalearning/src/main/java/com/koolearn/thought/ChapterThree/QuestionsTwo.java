package com.koolearn.thought.ChapterThree;

import static net.mindview.util.Print.print;

/**
 * @author : linwengang
 * create at:  2020/11/14  23:24
 * @description:练习2：（1）创建一个包含一个float域的类，并用这个类来展示别名的机制
 */
public class QuestionsTwo {
    public static void main(String[] args){
        EasureHeight u1 = new EasureHeight();
        EasureHeight u2 = new EasureHeight();
        u1.height = 1.25f;
        u2.height = 2.33f;
        print("u1.height="+u1.height+" ,u2.height="+ u2.height);

//        u1.height=u2.height;
//        print("u1.height="+u1.height+" ,u2.height="+ u2.height);

        u1=u2;
        print("u1.height="+u1.height+" ,u2.height="+ u2.height);

        u1.height=1.88f;
        print("u1.height="+u1.height+" ,u2.height="+ u2.height);

    }
}

class EasureHeight {
    float height;
}

