package scene;

public class Point3D extends Point2D {
	public float z;
	
	public double getDistance(Point3D target) {
		return Math.sqrt(
			Math.pow(x - target.x, 2) + 
			Math.pow(y - target.y, 2) +
			Math.pow(z - target.z, 2));
	}
}
