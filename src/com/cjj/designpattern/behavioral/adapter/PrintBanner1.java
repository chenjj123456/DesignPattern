package com.cjj.designpattern.behavioral.adapter;

/**
 * Created by chenjj on 2018/12/19
 */
public class PrintBanner1 extends Banner1 implements Print1 {
    public PrintBanner1(String string){
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();

    }
}
