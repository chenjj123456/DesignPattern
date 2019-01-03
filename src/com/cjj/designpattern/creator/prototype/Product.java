package com.cjj.designpattern.creator.prototype;

/**
 * Created by chenjj on 2018/12/20
 */
public interface Product extends Cloneable {
    public abstract void use(String s);
    public abstract Product createClone();
}
