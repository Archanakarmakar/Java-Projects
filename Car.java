package study;

public class Car {   // ToString using

	 int noOfWheels;
	 int noOfDoors;
	 int maxSpeed;
	 String name;
	 String modelNumber;
	 String company;
	
	public Car(int noOfWheels,int noOfDoors,int maxSpeed,String name,String modelNumber,String company) {
		this.noOfWheels=noOfWheels;
		this.noOfDoors=noOfDoors;
		this.maxSpeed= maxSpeed;
		this.name= name;
		this.modelNumber=modelNumber;
		this.company=company;
	}
	public String toString() {
		return "My car name is:"+name;
	}
	
    public static void main(String[] args)
    {
	// Car swift= new Car(noOfWheels 4,noOfDoors 4,maxSpeed:120,name:"swift",modelNumber:"SW896",company:"Maruti");
     Car swift= new Car(4,4,120,"swift","SW896","Maruti");
	 System.out.print(swift.toString());
     }
 }

