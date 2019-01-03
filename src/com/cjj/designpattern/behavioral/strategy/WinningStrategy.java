package com.cjj.designpattern.behavioral.strategy;

import java.util.Random;

/**
 * Created by chenjj on 2018/12/27
 */
public class WinningStrategy implements Strategy{

    private Random random;
    private boolean won=false;
    private Hand preHand;
    public WinningStrategy(int seed){
        random=new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if(!won){
            preHand=Hand.getHand(random.nextInt(3));
        }
        return preHand;
    }

    @Override
    public void study(boolean win) {
        won=win;
    }
}
