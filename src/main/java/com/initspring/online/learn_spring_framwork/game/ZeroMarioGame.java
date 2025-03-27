package com.initspring.online.learn_spring_framwork.game;

import org.springframework.stereotype.Component;

@Component
public class ZeroMarioGame implements GameConsole {
    public void up() {
        System.out.println("zeromario up");
    }

    public void down() {
        System.out.println("zeromario down");
    }

    public void left() {
        System.out.println("zeromario left");
    }

    public void right() {
        System.out.println("zeromario right");
    }
}
