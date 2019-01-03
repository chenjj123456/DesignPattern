package com.cjj.designpattern.structural.bridge;

/**
 * Created by chenjj on 2018/12/25
 */
public class Main {
    public static void main(String[] args){
        Display d1=new Display(new StringDisplayImpl("Hello,China."));
        Display d2=new CountDisplay(new StringDisplayImpl("Hello,China."));
        CountDisplay d3=new CountDisplay(new StringDisplayImpl("Hello,Universe"));
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
    }
}
