package com.cjj.designpattern.behavioral.observer;

/**
 * Created by chenjj on 2018/12/29
 */
public class DigitObserver implements Observer{
    @Override
    public void update(NumberGenerator generator) {
        System.out.println("DigitObserver:"+generator.getNumber());
        try{
            Thread.sleep(100);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
