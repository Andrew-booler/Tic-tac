package control;

import model.State;

public class Game {
	private State currentState;
	private int roleSelection;
	public static void main() {
		
	}
	public Game() {
		currentState = new State();
		
	}
	/**
	 * @return roleSelection
	 */
	public int getRoleSelection() {
		return roleSelection;
	}
	/**
	 * @param roleSelection ÒªÉèÖÃµÄ roleSelection
	 */
	public void setRoleSelection(int roleSelection) {
		this.roleSelection = roleSelection;
	}

}
