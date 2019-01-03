package com.cjj.designpattern.structural.decorator;

/**
 * Created by chenjj on 2018/12/28
 */
public class Main {
    public static void main(String[] args){
        Display b1=new StringDisplay("hello,world.");
        Display b2=new SideBorder(b1,'#');
        Display b3=new FullBorder(b2);
        b1.show();
        b2.show();
        b3.show();
        Display b4=new SideBorder(
                new FullBorder(
                        new FullBorder(
                                new SideBorder(
                                        new FullBorder(
                                                new StringDisplay("你好，世界。")
                                        ),'*'

                                )
                        )
                ),'/'
        );
        b4.show();

    }
}
