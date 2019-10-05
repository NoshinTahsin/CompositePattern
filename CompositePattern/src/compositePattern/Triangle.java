package compositePattern;

import java.util.ArrayList;

public class Triangle extends CompositeShape {

	private String shapeName; 
	
	
	
	
	 
	@Override
	public void buildShape() {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++)
		{
			BasicShape l1=new Line();
			
			addShape(l1); 
			
		}
	} 
	       

}
