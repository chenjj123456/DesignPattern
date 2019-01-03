package com.cjj.designpattern.behavioral.mediator;

import java.awt.*;

/**
 * Created by chenjj on 2018/12/29
 */
public class ColleagueButton extends Button implements Colleague{
    private Mediator mediator;
    public ColleagueButton(String caption){
        super(caption);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator=mediator;

    }

    @Override
    public void setColleagueEnable(boolean enabled) {
        setEnabled(enabled);

    }
}
