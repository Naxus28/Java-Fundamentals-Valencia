/**
 * @author gabrielferraz
 *
 */
public class ColoredLightBulb {
	private boolean lit;
	private String color = "white";
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public void setLit(boolean param) 
	{
		if(lit && param)
		{
			System.out.println("The bulb is already lit.");
		}
		else if(!lit && !param)
		{
			System.out.println("The bulb is already unlit.");
		}
		else {
			lit = param;
			String str = lit ? "lit." : "unlit.";
			System.out.println("The bulb is " + str + " and the bulb is " + color + ".");
		}
	}
	
	public boolean isLit()
	{
		return lit;
	}
}
