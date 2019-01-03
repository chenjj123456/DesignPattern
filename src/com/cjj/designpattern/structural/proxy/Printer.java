package com.cjj.designpattern.structural.proxy;

/**
 * Created by chenjj on 2019/1/2
 */
public class Printer implements Printable{
    private String name;
    public Printer(){
        heavyJob("正在生成Printer的实例");

    }

    private void heavyJob(String msg) {
        System.out.print(msg);
        for(int i=0;i<5;i++){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.print(".");
        }
        System.out.print("结束。");
    }

    public Printer(String name){
        this.name=name;
        heavyJob("正在生成Printer的实例("+name+")");
    }

    @Override
    public void setPrinterName(String name) {
        this.name=name;

    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        System.out.println("=== "+name+" ===");
        System.out.println(string);

    }
}
