package control;

import model.State;
import model.Action;

import java.util.ArrayList;

public class Computer {
	
	// take the computer's input and return an action
	public static Action play(State currentState, int role) {
		// copy current state
		State state = new State(currentState);
		
		return minimaxDecision(state, role);
	} 
	
	public static Action minimaxDecision(State state, int role) {
		int utility = Integer.MIN_VALUE;
		Action bestAction = null;
		ArrayList<Action> actions = state.getAvlActions();	// all applicable actions for this state
		for (Action action : actions) {
			State s = new State(state);
			s.update(action);
			int curUtility = minValue(s, action, role);
			if (curUtility > utility) {
				bestAction = action;
			}
		}
		
		return bestAction;
	}
	
	public static int maxValue(State state, Action action, int role) {
		if (state.isTerminal(action)) {
			return role == 1 ? state.getxUtility() : state.getoUtility();	// computer is X
		} else {
			int utility = Integer.MIN_VALUE;
			ArrayList<Action> actions = state.getAvlActions();
			for (Action a : actions) {
				State s = new State(state);
				s.update(action);
				utility = Math.max(utility, minValue(s, a, role));
			}
			
			return utility;
		}
	}
	
	public static int minValue(State state, Action action, int role) {
		if (state.isTerminal(action)) {
			return role == 1 ? state.getxUtility() : state.getoUtility();	// computer is O
		} else {
			int utility = Integer.MIN_VALUE;
			ArrayList<Action> actions = state.getAvlActions();
			for (Action a : actions) {
				State s = new State(state);
				s.update(a);
				utility = Math.min(utility, maxValue(s, a, role));
			}
			
			return utility;
		}
	}

}
