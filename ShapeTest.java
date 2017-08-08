abstract class Shape{
	abstract void draw();
}

class Line extends Shape{
	
	void draw(){
		System.out.println("This is a Line.");
	}
	
}

class Rectangle extends Shape{
	
	void draw(){
		System.out.println("This is a Rectangle.");
	}
}

class Cube extends Shape{

	void draw(){
		System.out.println("This is a cube.");
	}	
}

class ShapeTest{
	public static void main(String []args){
			
			Shape []shapes=new Shape[3];
			shapes[0]=new Line();
			shapes[1]=new Rectangle();
			shapes[2]=new Cube();
			
			for(Shape s:shapes)
				s.draw();
	}
}