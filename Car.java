package com.objects;

class Car
{
     String make;	 
     String model;
	 int year;
     String color;
     int speed;
     Car(String make, String model, int year, String color)
	 {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.speed = 0;
    }
    void start() 
	{
        System.out.println("Starting the " + make + " " + model + "...");
    }
    void accelerate(int amount) 
	{
        speed = speed + amount;
        System.out.println("Accelerating. Current speed: " + speed + " km/h");
    }
    void brake(int amount) 
	{
        if (speed - amount >= 0)
		{
            speed = speed - amount;
            System.out.println("Braking. Current speed: " + speed + " km/h");
        } 
		else 
			{
            System.out.println("Cannot brake further. Car is at rest.");
			}
    }
	String getInfo() 
	{
        return "Car Information: " + make + " " + model + ", Year: " + year + ", Color: " + color;
    }

	int getSpeed() 
	{
        return speed;
    }

    public static void main(String[] args) 
	{
        Car myCar = new Car("Toyota", "Corolla", 2022, "Blue");
        System.out.println(myCar.getInfo());
        myCar.start();
        myCar.accelerate(40);
        myCar.brake(10);
        System.out.println("Current speed: " + myCar.getSpeed() + " km/h");
    }
}
