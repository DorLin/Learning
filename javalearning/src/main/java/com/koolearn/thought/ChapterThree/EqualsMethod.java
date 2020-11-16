package com.koolearn.thought.ChapterThree;

/**
 * @author : linwengang
 * create at:  2020/11/15  08:15
 * @description:关系操作符==：比较引用地址  !=：比较地址引用  equals:比较值
 */
public class EqualsMethod {
    public static void relation(){
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.println(n1 == n2);
        System.out.println(n1 != n2);
        System.out.println(n1.equals(n2));
    }

    /**
     *
     * @param
     * @return void
     * @author linwengang
     * @date 2020/11/15 08:32
     */
    public static void EqualsMethod2(){
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        //equals()默认比较引用，第七章学习覆盖
        System.out.println(v1.equals(v2));
        System.out.println(v1.i==v2.i);
    }

    public static void main(String[] args) {
        relation();
        EqualsMethod2();
    }
}

class Value{
    int i;
}
