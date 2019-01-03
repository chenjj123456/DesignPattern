package com.cjj.designpattern.structural.decorator;

/**
 * Created by chenjj on 2018/12/27
 */
public abstract class Display {
    public abstract int getColumns();
    public abstract int getRows();
    public abstract String getRowText(int row);
    public final void show(){
        for(int i=0;i<getRows();i++){
            System.out.println(getRowText(i));
        }
    }

}
