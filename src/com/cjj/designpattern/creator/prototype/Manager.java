package com.cjj.designpattern.creator.prototype;

import java.util.HashMap;

/**
 * Created by chenjj on 2018/12/20
 */
public class Manager {
    private HashMap showcase=new HashMap();
    public void register(String name,Product proto){
        showcase.put(name,proto);
    }

    public Product create(String protoname){
        Product p=(Product)showcase.get(protoname);
        return p.createClone();
    }
}
