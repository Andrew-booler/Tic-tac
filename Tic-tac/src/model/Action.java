package model;



public class Action {



	private int position;

	/**
	 * @return position
	 */
	public int getPosition() {
		return position;
	}

	/**
	 * @param postion
	 */
	public void setPosition(int position) {
		this.position = position;
	}
	
	public Action(Action act){
		this.setPosition(act.getPosition());
	}
	
	public Action(int position) {
		this.setPosition(position);
	}
	
	Action(){}
}
