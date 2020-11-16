package com.koolearn.thought.ChapterThree;

/**
 * @author : linwengang
 * create at:  2020/11/15  13:40
 * @description:练习10：（3）编写一个具有两个常量值的程序，一个具有交替的二进制位1和0，其中最低有效位为0，另
 * 一个也具有交替的二进制位1和0，但是其最低有效位为1（提示：使用十六进制产量来表示是最简单的方法）。取这两个值，用按位操作符
 * 以所有可能的方式结合运算它们，然后用Integer.toBinaryString()显示
 */
public class QuestionsTen {
    public static void main(String[] args) {
        Integer a=0xaaaa;
        Integer b=0x5556;
        System.out.println("a="+Integer.toBinaryString(a)+"  b="+Integer.toBinaryString(b));
        //与
        System.out.println("a&b="+Integer.toBinaryString(a&b));
        System.out.println("a&=b="+Integer.toBinaryString(a&=b)+" ,a="+Integer.toBinaryString(a));
        System.out.println("a="+Integer.toBinaryString(a));
        //或
        System.out.println("a|b="+Integer.toBinaryString(a|b));
        //异或
        System.out.println("a^b="+Integer.toBinaryString(a^b));
        //非 非操作前面有很多1那是因为int型占32位，高位并没有使用
        System.out.println("~a="+Integer.toBinaryString(~a));

        System.out.println("~b="+Integer.toBinaryString(~b));

    }

}
