/**
 * 
 */
package net.thenumenorean.othelloai;

import net.thenumenorean.othelloai.board.Move;
import net.thenumenorean.othelloai.comms.CommLink;

/**
 * @author Francesco
 *
 */
public class InputListener implements Runnable{

	/**
	 * How long to wait in between sending the current best move
	 */
	private static final long STD_DELAY = 5000;
	private OthelloAI othelloAI;
	private CommLink link;
	private boolean stop;

	/**
	 * @param link 
	 * @param othelloAI 
	 * 
	 */
	public InputListener(OthelloAI othelloAI) {
		this.othelloAI = othelloAI;
		this.link = othelloAI.link;
		stop = false;
	}

	@Override
	public void run() {
		
		while(!stop) {
			
			Move m = link.receiveMove();
			othelloAI.board.move(m, OthelloAI.LOCAL_SIDE.opposite());
			othelloAI.boardChanged();
			
			try {
				Thread.sleep(STD_DELAY);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			link.sendMove(othelloAI.getBestMove());
			
		}
		
	}
	
	public void stop() {
		stop = true;
	}

}
