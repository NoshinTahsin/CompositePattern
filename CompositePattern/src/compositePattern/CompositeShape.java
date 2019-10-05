package compositePattern;

import java.util.ArrayList;

public abstract class CompositeShape implements Shape {
	
	private ArrayList <Shape> ShapeList=new ArrayList<Shape>();
    
    @Override
    public void draw()  
    { 
    	buildShape();
        for(Shape s:ShapeList) 
        { 
        	 s.draw();
        } 
    } 
       
   public void addShape(Shape sh) {
	   
	   ShapeList.add(sh);
	   
   }
   public abstract void buildShape();
   
    
	

}
