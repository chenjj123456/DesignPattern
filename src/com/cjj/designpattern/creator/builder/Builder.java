package com.cjj.designpattern.creator.builder;

/**
 * Created by chenjj on 2018/12/21
 */
public abstract class Builder {
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract void close();
}
