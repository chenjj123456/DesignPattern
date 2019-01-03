package com.cjj.designpattern.behavioral.template;

/**
 * Created by chenjj on 2018/12/19
 */
public abstract class AbstractDisplay {
    public abstract void open();
    public abstract void print();
    public abstract void close();
    public final void display(){
        open();
        for(int i=0;i<5;i++){
            print();
        }
        close();
    }
}
