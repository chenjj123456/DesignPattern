package com.cjj.designpattern.creator.abstractFactory.factory;

import java.util.ArrayList;

/**
 * Created by chenjj on 2018/12/25
 */
public abstract class Tray extends Item{
    protected ArrayList tray=new ArrayList();
    public Tray(String caption){
        super(caption);
    }

    public void add(Item item){
        tray.add(item);
    }
}
