package com.cjj.designpattern.structural.bridge;

/**
 * Created by chenjj on 2018/12/25
 */
public class CountDisplay extends Display{
    public CountDisplay(DisplayImpl impl){
        super(impl);
    }

    public void multiDisplay(int times){
        open();
        for(int i=0;i<times;i++){
            print();
        }
        close();
    }
}
