package com.cjj.designpattern.structural.flyweight;

import java.util.HashMap;

/**
 * Created by chenjj on 2019/1/2
 */
public class BigCharFactory {
    private HashMap pool=new HashMap();
    private static BigCharFactory singleton=new BigCharFactory();

    private BigCharFactory(){}

    public static BigCharFactory getInstance(){
        return singleton;
    }

    public synchronized BigChar getBigChar(char charname){
        BigChar bc=(BigChar)pool.get(""+charname);
        if(bc==null){
            bc=new BigChar(charname);
            pool.put(""+charname,bc);
        }
        return bc;
    }
}
