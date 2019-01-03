package com.cjj.designpattern.behavioral.adapter;

/**
 * Created by chenjj on 2018/12/19
 */
public class Banner1 {
    private String string;
    public Banner1(String string){
        this.string=string;
    }

    public void showWithParen(){
        System.out.println("("+string+")");
    }

    public void showWithAster(){
        System.out.println("*"+string+"*");
    }
}
