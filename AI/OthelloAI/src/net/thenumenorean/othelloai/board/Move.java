package net.thenumenorean.othelloai.board;

/**
 * Represents a square on the Othello board.
 * 
 * @author Francesco
 *
 */
public class Move {

	private int x, y;

	/**
	 * Creates a new Move with the given coordinates.
	 * 
	 * @param y
	 * @param x
	 * 
	 */
	public Move(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Get the X value for this move. If not a move, returns -1.
	 * 
	 * @return An integer
	 */
	public int getX() {
		return x;
	}

	/**
	 * Get the Y value for this move. If not a move, returns -1.
	 * 
	 * @return An integer
	 */
	public int getY() {
		return y;
	}

}