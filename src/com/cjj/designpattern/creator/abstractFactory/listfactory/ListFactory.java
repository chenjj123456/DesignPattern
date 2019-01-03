package com.cjj.designpattern.creator.abstractFactory.listfactory;

import com.cjj.designpattern.creator.abstractFactory.factory.Factory;
import com.cjj.designpattern.creator.abstractFactory.factory.Link;
import com.cjj.designpattern.creator.abstractFactory.factory.Page;
import com.cjj.designpattern.creator.abstractFactory.factory.Tray;

/**
 * Created by chenjj on 2018/12/25
 */
public class ListFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption,url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title,author);
    }
}
