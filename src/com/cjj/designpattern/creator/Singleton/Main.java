package com.cjj.designpattern.creator.Singleton;

/**
 * Created by chenjj on 2018/12/20
 */
public class Main {
    public static void main(String[] args){
        System.out.println("Start.");
        Singleton obj1=Singleton.getInstance();
        Singleton obj2=Singleton.getInstance();
        if(obj1==obj2){
            System.out.println("obj1和obj2是相同的实例。");
        }else {
            System.out.println("obj1和obj2不是相同的实例");
        }

        System.out.println("End.");
    }
}
