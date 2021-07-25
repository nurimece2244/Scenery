/**
 * Building class is done according to the uml diagram.
 * @author Nur
 *
 */
public class Building {
 private int floorCount; // the number of floors of the building
 private double centerX; // the center x coordinate of the building
 private double buildingWidth; // the width of the building
 private String buildingColor; // color of the building
 private double FLOOR_HEIGHT = 0.06; // the height of a floor number is fixed
 
 double roofHeight = 0.03; // the height of a roof number is fixed
 double centerY = FLOOR_HEIGHT/2; // centerY is equal to half of the floor height
 
 /**
  * 
  * @param floorCount is the number of floors of the building
  * @param centerX is the center x coordinate of the building
  * @param buildingWidth is  the width of the building
  * @param buildingColor is color of the building
  */
 Building(int floorCount,double centerX,double buildingWidth, String buildingColor ){
	 this.floorCount = floorCount;
	 this.centerX =centerX;
	 this.buildingWidth= buildingWidth;
	 this.buildingColor = buildingColor;
	 
 }
 /**
  * Rectangle and Polygon(roof) are drawn according to the methods in StdDraw.
  */

 public void drawbuilding() {
	/**
	 * Draws as many rectangles as the number of floors,
	 *  then the color is determined and drawn.
	 */
	
	 for (int i=0; i< floorCount;i++) {
	 StdDraw.setPenColor(StdDraw.BLACK);
	 StdDraw.rectangle(centerX, centerY,buildingWidth/2, FLOOR_HEIGHT/2);
	 // Rectangle formula is centerX, centerY and width/2 and height/2
	 if(buildingColor.equals("Orange") ){
		 StdDraw.setPenColor(StdDraw.ORANGE);
			
	 }
	 else if (buildingColor.equals("Blue") ) {
		 StdDraw.setPenColor(StdDraw. BOOK_LIGHT_BLUE);
		 
	 }
	 else if (buildingColor.equals("Red")) {
		 StdDraw.setPenColor(StdDraw.RED);
	 }
	 else if (buildingColor.equals("Yellow")) {
		 StdDraw.setPenColor(StdDraw.YELLOW);
	 }
	 else if (buildingColor.equals("Green")) {
		 StdDraw.setPenColor(StdDraw.GREEN);
	 }
	 StdDraw.filledRectangle(centerX, centerY,buildingWidth/2, FLOOR_HEIGHT/2);

	  
	 centerY += FLOOR_HEIGHT; // As the number of floors increases every time centerY change, centerX is fixed.
	 /**
	  *The roof has three points. 
	  *The coordinates of these points are kept in separate x and y arrays.
	  */
	 double[] x = {centerX-(buildingWidth/2),centerX-buildingWidth/2+ buildingWidth, centerX};
	 double[] y = {FLOOR_HEIGHT*floorCount, FLOOR_HEIGHT*floorCount, (FLOOR_HEIGHT*floorCount)+roofHeight}; 
	 StdDraw.setPenColor(StdDraw. PRINCETON_ORANGE); 
	 StdDraw.filledPolygon(x, y); 

	 
	 }
	 }

public int getFloorCount() {
	return floorCount;
}

public void setFloorCount(int floorCount) {
	this.floorCount = floorCount;
}

public double getCenterX() {
	return centerX;
}

public void setCenterX(double centerX) {
	this.centerX = centerX;
}

public double getBuildingWidth() {
	return buildingWidth;
}

public void setBuildingWidth(double buildingWidth) {
	this.buildingWidth = buildingWidth;
}

public String getBuildingColor() {
	return buildingColor;
}

public void setBuildingColor(String buildingColor) {
	this.buildingColor = buildingColor;
}

public double getFLOOR_HEIGHT() {
	return FLOOR_HEIGHT;
}

public void setFLOOR_HEIGHT(double fLOOR_HEIGHT) {
	FLOOR_HEIGHT = fLOOR_HEIGHT;
}
 
 
}
