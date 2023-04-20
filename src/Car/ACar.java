package Car;

import Car.Car;

public abstract class ACar implements Car {
private String registrationNumber;
private String make;

private String model;

private int numberOfDoors;

public ACar(String registrationNumber,String make,String model,int numberOfDoors){
    this.registrationNumber=registrationNumber;
    this.model=model;
    this.make=make;
    this.numberOfDoors=numberOfDoors;
}

public String getRegistrationNumber(){
    return registrationNumber;

}

public String getMake(){
    return make;

}

public String getModel(){
    return model;

}

public int getNumberOfDoors(){
    return numberOfDoors;

}
@Override
public String toString(){
    return "Registration Number: " + registrationNumber + ", Make: " + make + ", Model: " + model + ", Number of Doors: " + numberOfDoors;

}


}
