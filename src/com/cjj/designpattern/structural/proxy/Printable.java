package com.cjj.designpattern.structural.proxy;

/**
 * Created by chenjj on 2019/1/2
 */
public interface Printable {
    public abstract void setPrinterName(String name);
    public abstract String getPrinterName();
    public abstract void print(String string);
}
