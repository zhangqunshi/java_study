package com.nastation.c06;

class Game {
	Game(int i) {
		System.out.println("Game constructor" + i);
	}
}

class BoardGame extends Game {
	BoardGame(int i) {
		super(i);
		i = 10;
		System.out.println("BoardGame constructor" + i);
	}
}

/**
 * ���в����Ĺ��캯��
 * @author kris
 */
public class Chess extends BoardGame {
	Chess() {
		super(11);
		System.out.println("Chess constructor");
	}

	public static void main(String[] args) {
		Chess x = new Chess();
	}
}