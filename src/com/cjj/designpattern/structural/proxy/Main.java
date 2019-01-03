package com.cjj.designpattern.structural.proxy;

/**
 * Created by chenjj on 2019/1/2
 */
public class Main {
    public static void main(String[] args){
        Printable p=new PrinterProxy("Alice");
        System.out.println("���ڵ�������"+p.getPrinterName()+"��");
        p.setPrinterName("Bob");
        System.out.println("���ڵ�������"+p.getPrinterName()+"��");
        p.print("Hello,world.");
    }
}
