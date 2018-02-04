package control;

import model.State;
import view.Interaction;

public class Game {
	private State currentState;
	private int roleSelection;
	public static void main() {
		while (true) {
			Game game = new Game();
			if (game.getRoleSelection()==1) {
				while(true) {
					Interaction.displayBoard(game.getCurrentState());
					Action act = null;
					
				}
			}
		}
	}
	public Game() {
		currentState = new State();
		roleSelection = Interaction.selectRole();
	}
	/**
	 * @return roleSelection
	 */
	public int getRoleSelection() {
		return roleSelection;
	}
	/**
	 * @param roleSelection  roleSelection
	 */
	public void setRoleSelection(int roleSelection) {
		this.roleSelection = roleSelection;
	}
	public State getCurrentState() {
		return currentState;
	}
	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}

}
