package Exercise_1.Structural.decorator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Start with a basic coffee
        Coffee coffee = new BasicCoffee();

        // Ask the user for add-ons
        System.out.println("Do you want to add milk? (yes/no): ");
        String addMilk = scanner.nextLine();
        if (addMilk.equalsIgnoreCase("yes")) {
            coffee = new MilkDecorator(coffee);
        }

        System.out.println("Do you want to add sugar? (yes/no): ");
        String addSugar = scanner.nextLine();
        if (addSugar.equalsIgnoreCase("yes")) {
            coffee = new SugarDecorator(coffee);
        }

        // Print the final order description and cost
        System.out.println("Your order: " + coffee.getDescription());
        System.out.println("Total cost: " + coffee.cost());
    }
}

