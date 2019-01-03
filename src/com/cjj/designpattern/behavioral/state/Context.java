package com.cjj.designpattern.behavioral.state;

/**
 * Created by chenjj on 2018/12/29
 */
public interface Context {
    public abstract void setClock(int hour);
    public abstract void changeState(State state);
    public abstract void callSecurityCenter(String msg);
    public abstract void recordLog(String msg);

}
