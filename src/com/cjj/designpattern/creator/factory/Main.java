package com.cjj.designpattern.creator.factory;

import com.cjj.designpattern.creator.factory.framework.Factory;
import com.cjj.designpattern.creator.factory.framework.Product;
import com.cjj.designpattern.creator.factory.idcard.IDCardFactory;

/**
 * Created by chenjj on 2018/12/20
 */
public class Main {
    public static void main(String[] args){
        Factory factory=new IDCardFactory();
        Product card1=factory.create("小明");
        Product card2=factory.create("小红");
        Product card3=factory.create("小刚");
        card1.use();
        card2.use();
        card3.use();
    }
}
