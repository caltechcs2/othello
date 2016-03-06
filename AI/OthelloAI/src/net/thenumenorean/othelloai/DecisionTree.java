package net.thenumenorean.othelloai;

import java.util.concurrent.ConcurrentSkipListSet;

/**
 * Represents everything discovered by the AI
 * @author Francesco
 *
 */
public class DecisionTree {

	public DecisionTree() {
		
	}
	
	public static class DecisionTreeNode implements Comparable<DecisionTreeNode>{
		
		private int value;
		
		private ConcurrentSkipListSet<DecisionTreeNode> children;
		private DecisionTreeNode parent;
		
		public DecisionTreeNode() {
			children = new ConcurrentSkipListSet<DecisionTreeNode>();
		}

		@Override
		public int compareTo(DecisionTreeNode o) {
			// TODO Auto-generated method stub
			return 0;
		}

		public DecisionTreeNode getParent() {
			return parent;
		}

		public void setParent(DecisionTreeNode parent) {
			this.parent = parent;
		}
		
	}
	
	

}
