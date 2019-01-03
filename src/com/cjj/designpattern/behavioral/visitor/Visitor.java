package com.cjj.designpattern.behavioral.visitor;



/**
 * Created by chenjj on 2018/12/28
 */
public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
