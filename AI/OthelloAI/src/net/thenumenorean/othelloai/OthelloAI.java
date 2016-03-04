package net.thenumenorean.othelloai;

import net.thenumenorean.othelloai.board.Move;
import net.thenumenorean.othelloai.board.OthelloBoard;
import net.thenumenorean.othelloai.board.OthelloBoard.OthelloSide;
import net.thenumenorean.othelloai.comms.CommLink;
import net.thenumenorean.othelloai.comms.StdCommLink;

public class OthelloAI {
	
	public static final OthelloSide LOCAL_SIDE = OthelloBoard.OthelloSide.BLACK;

	public OthelloBoard board;
	public CommLink link;

	private InputListener inputListener;
	private AIThread aiThread;

	public static void main(String[] args) {
		
		
		CommLink link = new StdCommLink();
		OthelloAI ai = new OthelloAI(link);
		
		//Better to not return this method until all is finished
		try {
			ai.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public OthelloAI(CommLink link) {
		
		this.link = link;
		board = new OthelloBoard();
		inputListener = new InputListener(this);
		aiThread = new AIThread(this);
		
		
		//Start all required threads after initializing
		new Thread(inputListener).start();
		
		
		//Inform host that init is done
		link.sendInitDone();
		
	}

	/**
	 * Indicates that a move has been made, and that 
	 */
	public void boardChanged() {
		
		
	}

	public Move getBestMove() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * Manages helper threads, and insures things keep running smoothly.
	 * 
	 * 
	 * 
	 * @author Francesco
	 *
	 */
	private class AIThread implements Runnable {
		
		private OthelloAI othelloAI;

		public AIThread(OthelloAI othelloAI) {
			this.othelloAI = othelloAI;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
	}

}
