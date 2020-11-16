package com.koolearn.thought.ChapterThree;

import java.util.Random;
import static net.mindview.util.Print.*;
/**
 * @author : linwengang
 * create at:  2020/11/15  07:02
 * @description:
 */
public class MathOps {
    public static void main(String[] args) {
        Random rand = new Random(50);
        int i,j,k;
        j = rand.nextInt(200)+1;
        print("j: "+j);
        k = rand.nextInt(100)+1;
        print("k: "+k);
        i = j - k;
        print("j - k: "+i);
        i = k/j;
        print("k/j: "+i);
        i = k*j;
        print("k*j:"+i);
        i= k%j;
        print("k%j:"+i);
        j%=k;
        print("j%k:"+j);

        float u,v,w;
        v = rand.nextFloat();
        print("v:"+v);
        w = rand.nextFloat();
        print("w:"+w);
        u = v+w;
        print("v+w:"+u);
        u=v-w;
        print("v-w:"+u);
        u = v*w;
        print("v*w"+u);
        u=v/w;
        print("v/w:"+u);
        u+=v;
        print("u+=v:"+u);
        u-=v;
        print("u-=v:"+u);
        u*=v;
        print("u*=v:"+u);
        u/=v;
        print("u/=v:"+u);
    }
}
