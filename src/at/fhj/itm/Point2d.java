package at.fhj.itm;
/**
 * 
 * @author Yasin A
 * @version 22.06.2016
 */
class Point2d {
	private boolean debug;
	double x;
	double y;
	/**
	 * 
	 * @param px
	 * @param py
	 * 
	 * First Constructor
	 */
	public Point2d (double px, double py)
	{ 
		this.x=px;
		this.y=py;
	}
	/**
	 * 2nd Constructor 
	 * just create a point of 0/0
	 */
	public Point2d () 
	{		
		this.x=0;
		this.y=0;
		
	}
	/**
	 * 
	 * @param pt
	 * copy the values of 2nd constructor
	 */
	public Point2d (Point2d pt) 
	{	
		this.x= pt.x; 
		this.y=pt.y;
	}
	/**
	 * 
	 * @param s
	 * @
	 *
	 */
	public void dprint (String s) {
		if (debug)
			System.out.println("Debug: " + s);
	}
	/**
	 * 
	 * @param b
	 * a setter method for debugging
	 * Refers to the True in the Main class
	 */
	public void setDebug (boolean b) {
		this.debug=b; 
	}
	/**
	 * 
	 * @param px
	 * setter for x 
	 */
	public void setX(double px) {
		dprint ("setX(): Changing value of X from " + x + " to " + px );
		this.x = px;
	}
	/**
	 * 
	 * @return
	 * getter method  for X
	 */
	public double getX() {
		return x;
	}
	/**
	 * 
	 * @param py
	 * setter method for Y
	 */
	public void setY(double py)  {
		dprint ("setY(): Changing value of Y from " + y + " to " + py );
		this.y=py;

	}
	/**
	 * 
	 * @return y 
	 * 
	 */
	public double getY() {
		return y;
	}
	/**
	 * 
	 * @param px
	 * @param py
	 * a setter Method for X and Y 
	 */
	public void setXY(double px, double py) {
		dprint ("setX(): Changing value of X from " + x + " to " + px );
		dprint ("setY(): Changing value of Y from " + y + " to " + py );
		this.x=px;
		this.y=py;

	}
	/**
	 * 
	 * @param pt
	 * @return the result  from the distance from x to y
	 */
	public double distanceFrom (Point2d pt) {
		double newX = pt.x -this.x;
		double newY = pt.y - this.y;
		double newX2 = Math.pow(newX, 2);
		double newY2 = Math.pow(newY,2);
		double erg=  Math.sqrt(newX2 + newY2);

		return erg;
	}
	/**
	 * 
	 * @return the result from origin 
	 */
	public double distanceFromOrigin () {
		double newX = 0 - this.x;
		double newY = 0 -this.y;
		double newX2 = Math.pow(newX, 2);
		double newY2 = Math.pow(newY,2);
		double erg=  Math.sqrt(newX2 + newY2);

		return erg;
	}
	/**
	 *@return the scheme of systemout
	 */
	public String toString() {
		return "P( " + x + "/" + y + ")";
	}
}

