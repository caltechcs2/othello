package net.thenumenorean.othelloai.board;

public class Move {

	private int x, y;
	
	/**
	 * @param y 
	 * @param x 
	 * 
	 */
	public Move(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}