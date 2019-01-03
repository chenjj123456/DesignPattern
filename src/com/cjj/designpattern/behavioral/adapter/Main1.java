package com.cjj.designpattern.behavioral.adapter;

/**
 * Created by chenjj on 2018/12/19
 */
public class Main1 {
    public static void main(String[] args){
        Print1 p=new PrintBanner1("Hello");
        p.printWeak();
        p.printStrong();
    }
}
