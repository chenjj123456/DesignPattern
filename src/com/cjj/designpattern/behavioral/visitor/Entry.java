package com.cjj.designpattern.behavioral.visitor;

import com.cjj.designpattern.structural.composite.FileTreatmentException;

/**
 * Created by chenjj on 2018/12/28
 */
public abstract class Entry implements Element{
    public abstract String getName();
    public abstract int getSize();
    public Entry add(Entry entry)throws FileTreatmentException{
        throw new FileTreatmentException();
    }

    public java.util.Iterator iterator()throws FileTreatmentException{
        throw new FileTreatmentException();
    }

    public String toString(){
        return getName()+"("+getSize()+")";
    }
}
