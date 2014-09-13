package scene;

public class Vector3D extends Vector2D {
	public float z;
	
	public Vector3D(Point3D origin, Point3D target) {
		x = target.x - origin.x;
		y = target.y - origin.y;
		z = target.z - origin.z;
	}
	
	public double getLength() {
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
	}

}
