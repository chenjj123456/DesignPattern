package com.cjj.designpattern.behavioral.visitor;

/**
 * Created by chenjj on 2018/12/28
 */
public interface Element {
    public abstract void accept(Visitor v);
}
