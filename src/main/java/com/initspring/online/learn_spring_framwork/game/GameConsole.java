package com.initspring.online.learn_spring_framwork.game;

import org.springframework.stereotype.Component;

@Component
public interface GameConsole {
    void up();
    void down();
    void left();
    void right();
}
