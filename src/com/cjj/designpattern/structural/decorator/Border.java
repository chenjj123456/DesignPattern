package com.cjj.designpattern.structural.decorator;

/**
 * Created by chenjj on 2018/12/28
 */
public abstract class Border extends Display{
    protected Display display;
    protected Border(Display display){
        this.display=display;
    }
}
