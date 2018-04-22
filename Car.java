package generics;

public class Car {
	private String name;
	private Integer velocity;
	
	@Override
	public String toString() {
		String string = new String();
		string = name.toString() + " " + velocity.toString();
		return string;
	}
	
	public Car(int vel, String na) {
		velocity = vel;
		name = na;
	}
	
	public static void main(String args[]) {
		Car car1 = new Car(1, "lambo");
		Car car2 = new Car(2, "ferrari");
		Car car3 = new Car(3, "porsche");
		Car car4 = new Car(4, "altima");
		Car car5 = new Car(5, "accord");
		LL<Car> garage = new LL(new LLN(car1));
		garage.insert(car2);
		garage.insert(car3);
		garage.insert(car4);
		garage.insert(car5);
		garage.printList();
		System.out.print("\n");
		garage.remove();
		garage.printList();
	}

}
