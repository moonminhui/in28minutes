package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacManGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {

		// var game = new MarioGame();
		// var game = new SuperContraGame();
		var game = new PacManGame(); // 1 : Object Creation

		var gameRunner = new GameRunner(game);
			// 2 : Object Creation + Wiring of Dependencies (의존성 연결)
			// Game is a Dependency

		gameRunner.run();

	}

}
