package scene;

public class Vector3D extends Vector2D {
	public float z;
	private Point3D origin = new Point3D();
	private Point3D target = new Point3D();
	
	public Vector3D(Point3D origin, Point3D target) {
		this.origin = origin;
		this.target = target;
		x = target.x - origin.x;
		y = target.y - origin.y;
		z = target.z - origin.z;
	}
	
	public double getLength() {
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
	}

}
