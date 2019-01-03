package com.cjj.designpattern.behavioral.state;

/**
 * Created by chenjj on 2018/12/29
 */
public interface State {
    public abstract void doClock(Context context,int hour);
    public abstract void doUse(Context contex);
    public abstract void doAlarm(Context context);
    public abstract void doPhone(Context context);
}
