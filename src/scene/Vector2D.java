package scene;

public class Vector2D {
	public float x, y;
	
	public Vector2D() {
		
	}
	
	public Vector2D(Point2D origin, Point2D target) {
		x = target.x - origin.x;
		y = target.y - origin.y;
	}

}
