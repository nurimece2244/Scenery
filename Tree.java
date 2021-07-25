/**
 *  Tree class is done according to the uml diagram.
 * @author Nur
 *
 */
public class Tree {
	
	private double centerX; //  the center x coordinate of the tree
	private double TREE_BODY_HEIGHT = 0.08; // the height of the tree and fixed
	private double TREE_BODY_WIDTH = 0.02; // the width of the tree and fixed
	private double TREE_RADIUS =  0.04; // the radius of the tree and fixed
	
	/**
	 * 
	 * @param centerX is x coordinate of the tree
	 */
	
	Tree(double centerX){
		
		this.centerX=centerX;
	}
	/**
	 * Draws a tree according to the x coordinate and constant values
	 */
	public void drawTree() {
		 StdDraw.setPenColor(StdDraw.PINK);
		 StdDraw.filledRectangle(centerX, TREE_BODY_HEIGHT/2, TREE_BODY_WIDTH/2, TREE_BODY_HEIGHT/2);
		

		 StdDraw.setPenColor(StdDraw.GREEN);
		 StdDraw.filledCircle(centerX, TREE_BODY_HEIGHT+TREE_RADIUS, TREE_RADIUS);
	}
	
	
	public double getCenterX() {
		return centerX;
	}
	public void setCenterX(double centerX) {
		this.centerX = centerX;
	}
	public double getTREE_BODY_HEIGHT() {
		return TREE_BODY_HEIGHT;
	}
	public void setTREE_BODY_HEIGHT(double tREE_BODY_HEIGHT) {
		TREE_BODY_HEIGHT = tREE_BODY_HEIGHT;
	}
	public double getTREE_BODY_WIDTH() {
		return TREE_BODY_WIDTH;
	}
	public void setTREE_BODY_WIDTH(double tREE_BODY_WIDTH) {
		TREE_BODY_WIDTH = tREE_BODY_WIDTH;
	}
	public double getTREE_RADIUS() {
		return TREE_RADIUS;
	}
	public void setTREE_RADIUS(double tREE_RADIUS) {
		TREE_RADIUS = tREE_RADIUS;
	}
	
	
	

}
