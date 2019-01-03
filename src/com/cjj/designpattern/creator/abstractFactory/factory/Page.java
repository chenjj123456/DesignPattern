package com.cjj.designpattern.creator.abstractFactory.factory;

import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;

/**
 * Created by chenjj on 2018/12/25
 */
public abstract class Page {
    protected String title;
    protected String author;
    protected ArrayList content=new ArrayList();
    public Page(String title,String author){
        this.title=title;
        this.author=author;
    }

    public void add(Item item){
        content.add(item);
    }

    public void output(){
        try{
            String filename=title+".html";
            Writer writer=new FileWriter(filename);
            writer.close();
            System.out.println(filename+"编写完成。");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public abstract String makeHTML();

}
