/* Write the correct class definition with Attributes based on the given class diagram. */

import java.util.Scanner;

class Automobile{
    // Write your class attributes here
    String make;
    String model;
    int year;
    double miles_per_gallon;
}

public class Auto {
    // Don't change any code below this line
    public static void main(String []args){

        Scanner user_input = new Scanner (System.in);
        Automobile new_car = new Automobile();

        System.out.print("Enter the Auto Manufacturer: ");
        new_car.make = user_input.next();

        System.out.print("Enter the Model of the car: ");
        new_car.model = user_input.next();

        System.out.print("Enter the year of the car: ");
        new_car.year = user_input.nextInt();

        System.out.print("Enter the miles per gallon: ");
        new_car.miles_per_gallon = user_input.nextDouble();

        System.out.println("I'm driving a " + new_car.year + " " +  new_car.make + " " + new_car.model +
                " and it gets " + new_car.miles_per_gallon + " mpg!");
    }
}
