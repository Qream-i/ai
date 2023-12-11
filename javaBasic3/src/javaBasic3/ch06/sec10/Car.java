package javaBasic3.ch06.sec10;

public class Car {
	String model="그랜저";
	int speed;
	int maxSpeed=350 ;
	boolean start;
	String color = "검정";
	String company = "현대자동차";
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String company,String model, String color,int speed, int maxSpeed ) {
		super();
		this.model = model;
		this.speed = speed;
		this.maxSpeed = maxSpeed;
		this.start = start;
		this.color = color;
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public boolean isStart() {
		return start;
	}

	public void setStart(boolean start) {
		this.start = start;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	
	
	

	
}
