package com.cjj.designpattern.creator.abstractFactory.listfactory;

import com.cjj.designpattern.creator.abstractFactory.factory.Item;
import com.cjj.designpattern.creator.abstractFactory.factory.Page;

import java.util.Iterator;

/**
 * Created by chenjj on 2018/12/25
 */
public class ListPage extends Page {
    public ListPage(String title,String author){
        super(title,author);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer=new StringBuffer();
        buffer.append("<html><head><title>"+title+"</title></head>");
        buffer.append("<body>\n");
        buffer.append("<h1>"+title+"</h1>\n");
        buffer.append("<ul>\n");
        Iterator it=content.iterator();
        while (it.hasNext()){
            Item item=(Item)it.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("<ul>\n");
        buffer.append("<hr><address>"+author+"</address>");
        buffer.append("</body></html>");
        return buffer.toString();
    }
}
