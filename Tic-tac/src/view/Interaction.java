package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import model.Action;
import model.State;

public class Interaction {
	static int selectRole() {
		System.err.println("Welcome to Tic-Tac-Toe");
		System.err.println("Please select your side ( 1 as X and -1 as O ):");
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		try {
			return Integer.parseInt(stdIn.readLine());
		} catch (NumberFormatException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return 0;
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return 0;
		}
	}
	static void displayBoard(State state) {
		System.err.println("The current board status is:");
		String board_dis = "";
		int[][] board = state.getBoard();
		//The default of board size is 3*3
		for(int i=0;i<3;i++) {
			board_dis+="_________\n";
			for (int j=0;j<3;j++) {
				board_dis+="|";
				if(board[i][j]==1) {
					board_dis+="X";
				}else {
					board_dis+="O";
				}
			}
			board_dis+="|";
		}
		board_dis+="_________\n";
		System.err.println(board_dis);

	}
	
	Action play()  {
		System.err.println("Please select your next move:");
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		try {
			return new Action(Integer.parseInt(stdIn.readLine()));
			
		} catch (NumberFormatException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return null;
		}
		
	}
	
	public static void displayMsg(String msg) {
		System.err.println(msg);
	}
	
	public static void displayMove(Action act) {
		System.out.println(act.getPostion());
	}
}
