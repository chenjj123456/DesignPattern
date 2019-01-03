package com.cjj.designpattern.behavioral.command.drawer;

import com.cjj.designpattern.behavioral.command.Command;

import java.awt.*;

/**
 * Created by chenjj on 2019/1/2
 */
public class DrawCommand implements Command {
    protected Drawable drawable;
    private Point position;

    public DrawCommand(Drawable drawable,Point position){
        this.drawable=drawable;
        this.position=position;
    }

    @Override
    public void execute() {
        drawable.draw(position.x,position.y);

    }
}
