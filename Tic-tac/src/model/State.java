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
	
	// check whether an action is valid
	public boolean isValidAction(Action action) {
		int pos = action.getPosition();
		int row = (pos - 1) / 3;
		int col = (pos - 1) % 3;
		
		return board[row][col] == 0 ? true : false;
	}
	
	// update state according to the action
	public void update (Action action) {
		int pos = action.getPosition();
		int row = (pos - 1) / 3;
		int col = (pos - 1) % 3;
		
		if (turn == 1) {
			board[row][col] = 1;
		} else if (turn == -1) {
			board[row][col] = -1;
		} else {
			try {
				throw new Exception("No such turn: " + turn);
			} catch (Exception e) {
				System.err.print(e.getMessage());
			}
		}
	}
	
	// check whether this state is terminal when the action is taken
	public boolean isTerminal(Action action) {
		int pos = action.getPosition();
		int row = (pos - 1) / 3;
		int col = (pos - 1) % 3;
		
		if (board[row][0] + board[row][1] + board[row][2] == 3 || board[row][0] + board[row][1] + board[row][2] == -3 ||
			board[0][col] + board[1][col] + board[2][col] == 3 || board[0][col] + board[1][col] + board[2][col] == -3 ||
			board[0][0] + board[1][1] + board[2][2] == 3 || board[0][0] + board[1][1] + board[2][2] == -3 ||
			board[0][2] + board[1][1] + board[2][0] == 3 || board[0][2] + board[1][1] + board[2][0] == -3) {
			return true;
		} else {
			return false;
		}
	}
	
	// return utility when the state is terminal
	public int calUtility() {
		return 0;
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
