package at.fhj.itm;
class PointTester {
	/**
	 * 
	 * @param args
	 * 
	 * 
	 */
	public static void main (String[] args) {
		Point2d  pt1 = new Point2d ();

		System.out.println ("pt1 = " + pt1);//um zu schauen funktionieren unsere Rechnungen. 2 neue Punkte von der klasse Point2d und 

		Point2d pt2 = new Point2d(4.0, 3.0);

		System.out.println ("pt2 = " + pt2);

		pt1.setDebug(true);	

		System.out.println ("Distance from " + pt1 + " to " + pt2 +
				" is " + pt1.distanceFrom(pt2));

		System.out.println ("Distance from " + pt2 + " to " + pt1 +
				" is " + pt2.distanceFrom(pt1));

		System.out.println ("Distance from " + pt1 + " to the origin (0, 0) is " +
				pt1.distanceFromOrigin());

		System.out.println ("Distance from " + pt2 + " to the origin (0, 0) is " +
				pt2.distanceFromOrigin());

		pt1.setXY(3, 5);
		System.out.println ("pt1 = " + pt1);

		pt2.setXY(-3, -5);
		System.out.println ("pt2 = " + pt2);

		System.out.println ("Distance from " + pt1 + " to " + pt2 +
				" is " + pt1.distanceFrom(pt2));

		System.out.println ("Distance from " + pt2 + " to " + pt1 +
				" is " + pt2.distanceFrom(pt1));

		pt1.setDebug(false); 

		System.out.println ("Distance from " + pt1 + " to the origin (0, 0) is " +
				pt1.distanceFromOrigin());

		System.out.println ("Distance from " + pt2 + " to the origin (0, 0) is " +
				pt2.distanceFromOrigin());
	
	/*Point3d pt3 = new Point3d(1,2,3);
	Point3d pt4 = new Point3d(4,5,6);
	
	System.out.println ("Distance from " + pt3 + " to " + pt4 +
			" is " + pt3.distanceFrom(pt4));

	System.out.println ("Distance from " + pt4 + " to " + pt3 +
			" is " + pt4.distanceFrom(pt3));
	*/
	}
}

