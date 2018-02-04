package model;

public class State {

	private int[][] board;	// set all position to 0 (empty) by default
	private int turn;		// +1 for X, -1 for O; set to 0 by default
	private int utility;	// +1 for win, -1 for lose, 0 for tie (in MAX player's view); set to 0 by default
	
	// default constructor
	public State() {
		// initialize board
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = 0;
			}
		}
		// initialize turn
		turn = 0;
		// initialize utility
		utility = 0;
	}
	
	// copy constructor
	public State(State s) {
		board = s.getBoard();
		turn = s.getTurn();
		utility = s.getUtility();
	}
	
	// check whether the board is full
	public boolean isFull() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 0) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public boolean isValidAction(Action action) {
		int pos = action.getPosition();
		int row = (pos - 1) / 3;
		int col = (pos - 1) % 3;
		
		return 
	}
	
	// getters
	public int[][] getBoard() {
		return board;
	}

	public int getTurn() {
		return turn;
	}

	public int getUtility() {
		return utility;
	}
}
