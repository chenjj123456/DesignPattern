package com.cjj.designpattern.creator.abstractFactory.factory;

/**
 * Created by chenjj on 2018/12/25
 */
public abstract class Factory {
    public static Factory getFactory(String classname){
        Factory factory=null;
        try{
            factory=(Factory)Class.forName(classname).newInstance();
        }
         catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch(Exception e){
        e.printStackTrace();
    }
    return factory;
    }
    public abstract Link createLink(String caption,String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title,String author);

}
