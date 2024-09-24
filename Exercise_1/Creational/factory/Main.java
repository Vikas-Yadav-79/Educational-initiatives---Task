package Exercise_1.Creational.factory;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Car Factory!");
        System.out.println("Enter the type of car you want to create (sedan/suv):");
        String carType = scanner.nextLine();

        Car car = CarFactory.getCar(carType);

        if (car != null) {
            car.drive();
        } else {
            System.out.println("Invalid car type! Please choose 'sedan' or 'suv'.");
        }
    }
}
