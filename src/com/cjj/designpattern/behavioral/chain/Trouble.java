package com.cjj.designpattern.behavioral.chain;

/**
 * Created by chenjj on 2018/12/28
 */
public class Trouble {
    private int number;
    public Trouble(int number){
        this.number=number;
    }

    public int getNumber(){
        return number;
    }

    public String toString(){
        return "[Trouble"+number+"]";
    }
}
