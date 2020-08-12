package day27inheritance;

public class Car extends Vehicle {
	
	public Car() {
		super(2);
		
		System.out.println("car");
		
	}
	public Car(String name) {
		this();
		System.out.println("Car");
		System.out.println(name);
	}

	public static void main(String[] args) {
		Car c = new Car("honda");
				
		
		

	}

}
