package com.cjj.designpattern.behavioral.mediator;

/**
 * Created by chenjj on 2018/12/29
 */
public interface Colleague {
    public abstract void setMediator(Mediator mediator);
    public abstract  void setColleagueEnable(boolean enabled);
}
