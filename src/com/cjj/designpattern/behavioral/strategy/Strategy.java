package com.cjj.designpattern.behavioral.strategy;

/**
 * Created by chenjj on 2018/12/27
 */
public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}
