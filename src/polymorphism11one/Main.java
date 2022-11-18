package polymorphism11one;

class Main {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		shapes sp1 = new shapes();

		// as sublass are extended form the super class 
		// so the formet will be superclas obj = new c class-name();
		
		shapes triangle1 = new  Triangle();
		shapes mycircle = new Circle();
		
		triangle1.area();
		mycircle.area();
		sp1.area();
		
		
	}

}
