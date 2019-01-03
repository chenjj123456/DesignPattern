package com.cjj.designpattern.creator.factory.idcard;

import com.cjj.designpattern.creator.factory.framework.Product;

/**
 * Created by chenjj on 2018/12/19
 */
public class IDCard extends Product {
    private String owner;
    IDCard(String owner){
        System.out.println("制作"+owner+"的ID卡。");
        this.owner=owner;
    }

    @Override
    public void use() {
        System.out.println("使用"+owner+"的ID卡。");

    }

    public String getOwner(){
        return owner;
    }
}
