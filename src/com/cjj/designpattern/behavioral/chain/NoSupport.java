package com.cjj.designpattern.behavioral.chain;

/**
 * Created by chenjj on 2018/12/28
 */
public class NoSupport extends Support{
    public NoSupport(String name){
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
