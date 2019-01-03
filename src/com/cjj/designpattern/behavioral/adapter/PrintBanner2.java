package com.cjj.designpattern.behavioral.adapter;

import javax.annotation.processing.Processor;

/**
 * Created by chenjj on 2018/12/19
 */
public class PrintBanner2 extends Print2 {
    private Banner1 banner2;

    public PrintBanner2(String string){
        this.banner2=new Banner1(string);
    }

    @Override
    public void printWeak() {
       banner2.showWithParen();
    }

    @Override
    public void printStrong() {
        banner2.showWithAster();
    }
}
