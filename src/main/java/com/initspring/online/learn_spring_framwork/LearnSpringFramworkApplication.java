package com.initspring.online.learn_spring_framwork;

import com.initspring.online.learn_spring_framwork.game.GameRunner;
import com.initspring.online.learn_spring_framwork.game.MarioGame;
import com.initspring.online.learn_spring_framwork.game.PacManGame;
import com.initspring.online.learn_spring_framwork.game.ZeroMarioGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringFramworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFramworkApplication.class, args);
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
	}
}
