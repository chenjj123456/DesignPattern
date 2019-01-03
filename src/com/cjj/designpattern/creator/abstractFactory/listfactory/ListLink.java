package com.cjj.designpattern.creator.abstractFactory.listfactory;

import com.cjj.designpattern.creator.abstractFactory.factory.Link;

/**
 * Created by chenjj on 2018/12/25
 */
public class ListLink extends Link {
    public ListLink(String caption,String url){
        super(caption,url);
    }

    @Override
    public String makeHTML() {
        return " <li><a href=\""+url+"\">"+caption+"</a></li>\n";
    }
}
