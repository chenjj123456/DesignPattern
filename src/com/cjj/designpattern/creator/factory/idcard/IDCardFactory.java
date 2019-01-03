package com.cjj.designpattern.creator.factory.idcard;

import com.cjj.designpattern.creator.factory.framework.Factory;
import com.cjj.designpattern.creator.factory.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenjj on 2018/12/20
 */
public class IDCardFactory extends Factory {
    private List owners=new ArrayList();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());

    }

    public List getOwners(){
        return owners;
    }
}
