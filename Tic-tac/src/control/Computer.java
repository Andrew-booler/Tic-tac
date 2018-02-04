package control;

import model.State;

import java.util.ArrayList;

import model.Action;

public class Computer {
	
	// take the computer's input and return an action
	public static Action play(State currentState) {
		// copy current state
		State state = new State(currentState);
		
		return minimaxDecision(state);
	} 
	
	public static Action minimaxDecision(State state) {
		int utility = Integer.MIN_VALUE;
		Action bestAction = null;
		ArrayList<Action> actions = state.getAvlActions();	// all applicable actions for this state
		for (Action action : actions) {
			State s = new State(state);
			s.update(action);
			int curUtility = minValue(s, action);
			if (curUtility > utility) {
				bestAction = action;
			}
		}
		
		return bestAction;
	}
	
	public static int maxValue(State state, Action action) {
		if (state.isTerminal(action)) {
			return state.calUtility();
		} else {
			int utility = Integer.MIN_VALUE;
			ArrayList<Action> actions = state.getAvlActions();
			for (Action a : actions) {
				state.update(action);
				utility = Math.max(utility, minValue(state, a));
			}
			
			return utility;
		}
	}
	
	public static int minValue(State state, Action action) {
		if (state.isTerminal(action)) {
			return state.calUtility();
		} else {
			int utility = Integer.MIN_VALUE;
			ArrayList<Action> actions = state.getAvlActions();
			for (Action a : actions) {
				state.update(a);
				utility = Math.min(utility, maxValue(state, a));
			}
			
			return utility;
		}
	}
 
}
