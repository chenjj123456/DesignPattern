package com.cjj.designpattern.creator.abstractFactory.factory;

/**
 * Created by chenjj on 2018/12/24
 */
public abstract class Item {
    protected String caption;
    public Item(String caption){
        this.caption=caption;
    }
    public abstract String makeHTML();
}
