package control;

import model.Action;
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
					Action act = Interaction.play();
					while (!game.getCurrentState().isActionValid(act)) {
						Interaction.displayMsg("The Action is invalid");
						act= Interaction.play();
					}
					game.getCurrentState().update(act);
					if (game.getCurrentState().isTerminal()) {
						Interaction.displayBoard(game.getCurrentState());
						Interaction.displayMsg("You win!");
						break;
					}else {
						if (game.getCurrentState().isFull()) {
							Interaction.displayBoard(game.getCurrentState());
							Interaction.displayMsg("Tie.");
							break;
						}
					}
					
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
