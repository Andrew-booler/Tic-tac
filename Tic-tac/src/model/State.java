package model;

public class State {
	
	private int[][] board;	// a two-dimensional array, set to 0 (empty) by default
	private int turn;		// applicable player, +1 for X and -1 for O
	private int utility;	// -1 for lose; +1 for win; 0 for tie
	
	// default constructor
	public State() {   
		// set all positions in board to 0
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = 0;
			}
		}
	}
	
	// copy constructor
	public State(State s) {
		this.setBoard(s.getBoard());
		this.setTurn(s.getTurn());
		this.setUtility(s.getUtility());
	}

	// check whether the action is valid under current state
	boolean isValidAction(Action action) {
		int pos = action.getPostion();
		int row = (pos - 1) / 3;
		int col = (pos - 1) % 3;
  		return board[row][col] == 0 ? true : false;
	}
	
	// update state given an action
	void update(Action action) {
		
	}
	
	// getters and setters
	public int getTurn() {
		return turn;
	}

	public void setTurn(int turn) {
		this.turn = turn;
	}

	public int getUtility() {
		return utility;
	}

	public void setUtility(int utility) {
		this.utility = utility;
	}

	public int[][] getBoard() {
		return board;
	}

	public void setBoard(int[][] board) {
		this.board = board;
	}
	
}