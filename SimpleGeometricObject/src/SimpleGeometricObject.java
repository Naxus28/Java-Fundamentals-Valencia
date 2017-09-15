import java.util.Date;

public class SimpleGeometricObject {
	private String color;
	private boolean filled;
	private Date dateCreated;
	
	// default constructor
	public SimpleGeometricObject() {
		this("white", false);
		this.dateCreated = new Date();
	}
	
	// constructor with specific color and filled properties
	public SimpleGeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
		this.dateCreated = new Date();
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the filled
	 */
	public boolean isFilled() {
		return filled;
	}

	/**
	 * @param filled the filled to set
	 */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/**
	 * @return the dateCreated
	 */
	public Date getDateCreated() {
		return dateCreated;
	}
	
	@Override
	public String toString() {
		return "Created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}
}
