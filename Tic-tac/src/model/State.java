package model;

public class State {
	private int[][] board;
	private int turn;
	private int utility;
	/**
	 * @return board
	 */
	public int[][] getBoard() {
		return board;
	}
	/**
	 * @param board Ҫ���õ� board
	 */
	public void setBoard(int[][] board) {
		this.board = board;
	}
	/**
	 * @return utility
	 */
	public int getUtility() {
		return utility;
	}
	/**
	 * @param utility Ҫ���õ� utility
	 */
	public void setUtility(int utility) {
		this.utility = utility;
	}
	/**
	 * @return turn
	 */
	public int getTurn() {
		return turn;
	}
	/**
	 * @param turn Ҫ���õ� turn
	 */
	public void setTurn(int turn) {
		this.turn = turn;
	}
}
