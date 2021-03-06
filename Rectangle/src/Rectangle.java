public class Rectangle 
{
	private String rectName = "Parent Rectangle";
	private double width = 1;
	private double height = 1;
	

	public Rectangle()
	{
		// allows us to instatiate the class without any arguments
	}
	
	public Rectangle(String name, double w, double h)
	{
		this.rectName = name;
		this.width = w;
		this.height = h;
	}
	
	// setters are necessary in case the class is instantiated without default constructor values
	
	// width setter/getter 
	public void setWidth(double w)
	{
		this.width = w;
	}
	
	public double getWidth()
	{
		return this.width;
	}
	
	// width setter/getter 
	public void setHeight(double h)
	{
		this.height = h;
	}
	
	public double getHeight()
	{
		return this.height;
	}
	
	// name setter/getter	
	public void setName(String name)
	{
		this.rectName = name;
	}
	
	public String getName()
	{
		return this.rectName;
	}
	
	// get area
	public double getArea()
	{
		return this.width * this.height;
	}
	
	// get perimeter
	public double getPerimeter()
	{
		return (this.width * 2) + (this.height * 2);
	}
	
	// override string method
	public String toString()
	{
		return getName() + " has width of " + this.width + "cm, height of " + this.height + "cm, area of " + getArea() + " cm² and perimeter of " + getPerimeter() + " cm.";
	}

}
