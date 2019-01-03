package com.cjj.designpattern.creator.Singleton;

/**
 * Created by chenjj on 2018/12/20
 */
public class Singleton {
    private static Singleton singleton=new Singleton();
    private Singleton(){
        System.out.println("生成了一个实例。");
    }

    public static Singleton getInstance(){
        return singleton;
    }
}
