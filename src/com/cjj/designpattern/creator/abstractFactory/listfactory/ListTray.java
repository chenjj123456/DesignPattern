package com.cjj.designpattern.creator.abstractFactory.listfactory;

import com.cjj.designpattern.creator.abstractFactory.factory.Item;
import com.cjj.designpattern.creator.abstractFactory.factory.Tray;

import java.util.Iterator;

/**
 * Created by chenjj on 2018/12/25
 */
public class ListTray extends Tray {
    public  ListTray(String caption){
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer=new StringBuffer();
        buffer.append("<li>\n");
        buffer.append(caption+"\n");
        buffer.append("<ul>\n");
        Iterator it=tray.iterator();
        while (it.hasNext()){
            Item item=(Item)it.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("</li>\n");
        return buffer.toString();
    }
}
