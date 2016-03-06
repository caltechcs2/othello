package net.thenumenorean.othelloai;

import net.thenumenorean.othelloai.DecisionTree.DecisionTreeNode;
import net.thenumenorean.othelloai.board.OthelloBoard;
import net.thenumenorean.othelloai.board.PositionValue;

/**
 * Runs computation algorithms for the AI.
 * 
 * @author Francesco
 *
 */
public class AIJob implements Runnable {

	private OthelloAI othelloAI;
	private OthelloBoard board;
	private PositionValue pv;
	private DecisionTreeNode node;

	public AIJob(OthelloAI othelloAI, OthelloBoard board, PositionValue pv, DecisionTreeNode node) {
		this.othelloAI = othelloAI;
		this.board = board;
		this.pv = pv;
		this.node = node;
	}

	@Override
	public void run() {
		
		/*
		 * This method should calculate the value of the current move, then propagate it up the line to other moves.
		 */
		

	}

}
