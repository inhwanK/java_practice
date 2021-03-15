package java_practice.ch01;

public class Car {
	String color;
	String gearType;
	int door;

	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	Car(String color){
		this(color, "auto",4);
	}
}
