package com.cjj.designpattern.structural.composite;

/**
 * Created by chenjj on 2018/12/27
 */
public abstract class Entry {
    public abstract String getName();
    public abstract int getSize();
    public Entry add(Entry entry) throws FileTreatmentException{
        throw new FileTreatmentException();
    }

    public void printList(){
        printList("");
    }

    protected abstract void printList(String prefix);

    public String toString(){
        return getName()+"("+getSize()+")";
    }
}
