package polymorphism11one;

class shapes {
	
	// create a method on this 
	public void area() {
		
		System.out.println("Here tpo print the area of individual shapes ");
	}
}
	
	class Triangle extends shapes{
		public void area() {
			
			System.out.println("1/2 * base * hight ");
		}
	}
	
	class Circle extends shapes{
		public void area() {
			
			System.out.println(" 3.14 * radious ** 2");
		}
	}
	
	

	




