package net.thenumenorean.othelloai.comms;
import net.thenumenorean.othelloai.board.Move;

public interface CommLink {
	
	public void sendInitDone();
	public void sendMove(Move m);
	public Move receiveMove();

}
