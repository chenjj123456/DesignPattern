package com.cjj.designpattern.behavioral.chain;

/**
 * Created by chenjj on 2018/12/28
 */
public class OddSupport extends Support{
    public OddSupport(String name){
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if(trouble.getNumber()%2==1){
            return true;
        }else {
            return false;
        }
    }
}
