package javaproject;	
	
public class Shape1 {

	 public static void main(String[] args) {
	
		 Shape2 obj3;
		 
		 obj3 = new Circle1();
		 
		 obj3.displayInfo();
		 
		 
		 var obj1 = new Circle1();
		 Circle1 circleOBj = new Circle1();
		 
		 obj.area();
		 circleOBj.area();
		 
		 Rectangle recObj = new Rectangle();
		 recObj.displayInfo();
		 recObj.area();

		 recObj.displayInfo();

		 recObj.draw();

	        

	    }

}

	 

	   // 1. Create an abstract class named Shape.

	  //  2. Define abstract methods draw() and area().

	   // 3. Add a concrete method displayInfo() that prints basic info about the shape.

	   // 4. Create subclasses like Circle, Rectangle, and Triangle extending Shape.

	  //  5. Implement the abstract methods in each subclass.

	   // 6. In the main method, create a list of Shape objects, populate it with different shapes, and display their information.

	    

	

abstract class Shape2{
	public abstract void draw();

	public abstract void area();

	 

	   public void displayInfo() {

	       System.out.println(" beutiful");

	   }
	
}


class Circle1 extends Shape2{

	       public void  draw() {

	           System.out.println(" draw circle");

	       }

	       public void area() {

	           System.out.println(" area circle");

	       }

	       public void displayInfo() {

	           System.out.println(" beutiful");

	       }

	  }

class Rectangle extends Shape2{

	        public  void draw() {

	            System.out.println(" rectangledraw");

	        }

	        public void area() {

	            System.out.println("area shape");

	        }

	           public void displayInfo() {

	               System.out.println(" beutiful");

	    }
      

}



	 




