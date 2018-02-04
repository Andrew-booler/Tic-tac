package model;



public class Action {



	private int postion;

	/**
	 * @return postion
	 */
	public int getPostion() {
		return postion;
	}

	/**
	 * @param postion ÒªÉèÖÃµÄ postion
	 */
	public void setPostion(int postion) {
		this.postion = postion;
	}
	
	public Action(int postion){
		this.setPostion(postion);
	}
	
	Action(){}
}
