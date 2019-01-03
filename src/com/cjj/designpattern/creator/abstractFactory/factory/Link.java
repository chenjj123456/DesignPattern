package com.cjj.designpattern.creator.abstractFactory.factory;

/**
 * Created by chenjj on 2018/12/25
 */
public abstract class Link extends Item{
    protected String url;
    public Link(String caption,String url){
        super(caption);
        this.url=url;
    }

}
