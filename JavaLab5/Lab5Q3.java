package JavaLab5;

/* -------------------------- Q3 --------------------------
・Make a record to store information about a car. It should contain fields for: - make -or- brand (String) - model (String) - year (int)
・Create an ArrayList of Car objects.
・Sort the ArrayList of cars by year (Ascending) and print them out. */

import java.util.*;

public class Lab5Q3 {

  public static void main(String[] args) {
    
    // Create an ArrayList of Car objects.
    ArrayList<Car> cars = new ArrayList<Car>();

    //Make a record to store information about a car.   
    cars.add(new Car("TOYOTA", "Carolla2", 2022));
    cars.add(new Car("TOYOTA", "Carolla", 2017));
    cars.add(new Car("TOYOTA", "Hybrids", 2011));
    cars.add(new Car("TOYOTA", "SUVs", 2020));
    cars.add(new Car("SUZUKI", "SWIFT", 2015));
    cars.add(new Car("SUZUKI", "Jimny", 2018));
    cars.add(new Car("SUZUKI", "Selerio", 2019));
    cars.add(new Car("HONDA", "CR-V", 2021));
    cars.add(new Car("HONDA", "HR-V", 2019));

    //Sort the ArrayList of cars by year (Ascending) and print them out.
    cars.sort(null);

    for (int i = 0; i < cars.size(); i++) {
        System.out.println(cars.get(i).getYear() + " " + cars.get(i).getMake() + " " + cars.get(i).getModel());
    }
}
}

/*　Make a record to store information about a car. 
　　It should contain fields for: 
　　 - make -or- brand (String) - model (String) - year (int) */

// -------------------------------------------------------------

class Car { 

//Fields
String make;
String model;
int year;

//constructors
public Car(String make, String model, int year) {
    this.make = make;
    this.model = model;
    this.year = year;
}

//Methods
public String toString() {
    return make + " " + model + " " + year;
}

public String getMake() {
    return make;
}

public String getModel() {
    return model;
}

public int getYear() {
    return year;
}

}
