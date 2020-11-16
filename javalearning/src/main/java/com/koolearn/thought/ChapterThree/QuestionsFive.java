package com.koolearn.thought.ChapterThree;


/**
 * @author : linwengang
 * create at:  2020/11/15  08:37
 * @description:练习5：（2）创建一个名为Dog的类，它包含两个String域：name和says。在main()方法中，创建两个Dog对象，一个名为spot(它的叫声为"Ruff！")，另一个名为scruffy(它的叫声为"Wurf！")。然后显示他们的名字和叫声
 *练习6:(3)在练习5的基础上，创建一个新的Dog索引，并对其赋值为spot对象。测试用==和equals()方法来比较所有引用的结果
 */
public class QuestionsFive {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        d1.name = "spot";
        d1.says = "Ruff!";
        d2.name = "scruffy";
        d2.says = "Wurf！";
        System.out.println("d1.name:"+d1.name+"  d1.says:"+d1.says);
        System.out.println("d2.name:"+d2.name+"  d2.says:"+d2.says);

        Dog d3 = new Dog();
        d3.name = "spot";
        d3.says = "Ruff!";
        //比对地址引用，为什么是true？？？难道是对比基本数据类型原因？
        System.out.println(d1.name==d3.name);
        System.out.println(d1.name.equals(d3.name));
        System.out.println(d1==d3);
        System.out.println(d1.equals(d3));

        Dog d4 = new Dog();
        d4.name = d1.name;
        d4.says = d1.says;
        System.out.println(d1.name==d4.name);
        System.out.println(d1.name.equals(d4.name));
        System.out.println(d1==d4);
        System.out.println(d1.equals(d4));


    }


}
class Dog{
    String name;
    String says;
}
