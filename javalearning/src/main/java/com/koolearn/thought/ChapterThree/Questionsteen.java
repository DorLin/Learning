package com.koolearn.thought.ChapterThree;

/**
 * @author : linwengang
 * create at:  2020/11/15  16:09
 * @description:
 */
public class Questionsteen {
    static void f(boolean b) {
        if(b == true) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }


    static void stringTest(String s, String t) {
        f(s == t);
        f(s.equals(t));
        f(t.equals(s));
    }
    public static void main(String[] args) {
        String s = "one", t = "two";
        Questionsteen.stringTest(s, t);
        System.out.println("-------------------------");
        String s1 = "one", t1 = "one";
        Questionsteen.stringTest(s1, t1);
        System.out.println("-------------------------");
        String s3 = new String("one"), t3 =new String("one");
        Questionsteen.stringTest(s3, t3);
        System.out.println("-------------------------");
        String s2 = "one", t2 = s2;
        Questionsteen.stringTest(s2, t2);
        System.out.println("-------------------------");
    }

}
