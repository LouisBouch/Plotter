package vector;

public class Vector2D {
	/**
	 * x-coordinate
	 */
	private double x;
	/**
	 * y-coordinate
	 */
	private double y;

	
	
	/**
	 * Creates the zero vector if no parameters are given
	 */
	public Vector2D() {
		x = 0;
		y = 0;
	}
	
	/**
	 * Sets the value of this vector to its absolute value
	 */
	public void absolute() {
		
	}
	/**
	 * Sets the value of this vector to the absolute value of the vector <STRONG>v</STRONG>
	 * @param v Vector to take the absolute value from
	 */
	public void absolute(Vector2D v) {
	
	}
	
	/**
	 * Normalizes this vector
	 */
	public void normalize() {
		
	}
	/**
	 * Sets the value of this vector to the normalization of the vector <STRONG>v</STRONG>
	 * @param v Vector to normalize
	 */
	public void normalize(Vector2D v) {
		
	}
	/**
	 * Returns the length of this vector
	 * @return The length of this vector
	 */
	public double length() {
		return Math.sqrt(x*x + y*y);
	}
	/**
	 * Computes the dot product of this vector and the vector <STRONG>v</STRONG>
	 * @param v Vector to use for the dot product
	 * @return The result of the dot product
	 */
	public double dot(Vector2D v) {
		return x*v.getX() + y*v.getY();
	}
	/**
	 * Sets the value of this vector to the sum of the vector <STRONG>v</STRONG> and itself
	 * @param v Vector to use for the addition
	 */
	public void add(Vector2D v) {

	}
	/**
	 * Sets the value of this vector to the sum of vectors <STRONG>v1</STRONG> and <STRONG>v2</STRONG> 
	 * @param v1 First vector
	 * @param v2 Second vector
	 */
	public void add(Vector2D v1, Vector2D v2) {
		
	}
	
	/**
	 * Sets the value of this vector to the difference of the vector <STRONG>v</STRONG> and itself
	 * @param v Vector to use for the addition
	 */
	public void subtract(Vector2D v) {

	}
	/**
	 * Sets the value of this vector to the difference of vectors <STRONG>v1</STRONG> and <STRONG>v2</STRONG> 
	 * @param v1 First vector
	 * @param v2 Second vector
	 */
	public void subtract(Vector2D v1, Vector2D v2) {
		
	}
	
	 
	
	/**
	 * Gets the x-coordinate of the vector
	 * @return The x-coordinate of the vector
	 */
	public double getX() {
		return x;
	}
	/**
	 * Sets the x-coordinate of the vector
	 * @param x New x-coordinate
	 */
	public void setX(double x) {
		this.x = x;
	}
	
	/**
	 * Gets the y-coordinate of the vector
	 * @return The y-coordinate of the vector
	 */
	public double getY() {
		return y;
	}
	/**
	 * Sets the y-coordinate of the vector
	 * @param y New y-coordinate
	 */
	public void setY(double y) {
		this.y = y;
	}
	
	
	
	
	
}
///**
//* Sets the value of this vector to the sum of the vector <STRONG>v</STRONG> scaled by <STRONG>m</STRONG> and itself (this = m*v + this)
//* @param m Scalar used to multiply the vector <STRONG>v</STRONG>
//* @param v Vector to be multiplied
//*/
//public void addScaledVector(double m, Vector2D v) {
//	
//}