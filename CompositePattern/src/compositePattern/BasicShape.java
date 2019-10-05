package compositePattern;

public abstract class BasicShape implements Shape {

	private String shapeName; 
   
    
    public void draw()
	{
    	System.out.println( " Drawing Shape " + shapeName);
	}
}
