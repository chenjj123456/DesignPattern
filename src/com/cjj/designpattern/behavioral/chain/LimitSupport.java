package com.cjj.designpattern.behavioral.chain;

/**
 * Created by chenjj on 2018/12/28
 */
public class LimitSupport extends Support{
    private int limit;
    public LimitSupport(String name,int limit){
        super(name);
        this.limit=limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if(trouble.getNumber()<limit){
            return true;
        }else {
            return false;
        }
    }
}
