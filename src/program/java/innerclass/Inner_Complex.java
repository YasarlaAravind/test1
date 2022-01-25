package program.java.innerclass;

class Car {
	String carName;
	String carType;
	
	//assign values using constructor
	public Car(String name, String type) {
		this.carName = name;
		this.carType = type;
	}
	
	//private method
	private String getCarName() {
		return this.carName;
	}
	
	//inner class
	class Engine {
		String engineType;
		
		void setEngine() {
			
			//Accessing the carType property of Car
			if(Car.this.carType.equals("4WD")) {
				
				//Invoking method getCarName() of Car
				if(Car.this.getCarName().equals("Crysler")) {
					this.engineType = "Smaller";
				} else {
					this.engineType = "Bigger";
				}
			} else {
				this.engineType = "Bigger";
			}
		}
		
		String getEngineType() {
			return this.engineType;
		}
	}
}

public class Inner_Complex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating object of outer class
		Car car1 = new Car("Mazda", "8WD");
		
		//creating object of inner class
		Car.Engine engine1 = car1.new Engine();
		engine1.setEngine();
		System.out.println("Engine Type for 8WD: " + engine1.getEngineType());
		
		Car car2 = new Car("Crysler", "4WD");
		Car.Engine engine2 = car2.new Engine();
		engine2.setEngine();
		System.out.println("Engine Type for 8WD: " + engine2.getEngineType());
		

	}

}
