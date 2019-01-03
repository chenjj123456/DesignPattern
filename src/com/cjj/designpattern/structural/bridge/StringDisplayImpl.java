package com.cjj.designpattern.structural.bridge;

/**
 * Created by chenjj on 2018/12/25
 */
public class StringDisplayImpl extends DisplayImpl{
    private String string;
    private int width;
    public StringDisplayImpl(String string){
        this.string=string;
        this.width=string.getBytes().length;
    }
    
    @Override
    public void rawOpen() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for(int i=0;i<width;i++){
            System.out.print("-");
        }
        System.out.println("+");
    }

    @Override
    public void rawPrint() {
        System.out.println("|"+string+"|");//前后加上"|"并显示

    }

    @Override
    public void rawClose() {
        printLine();

    }
}
