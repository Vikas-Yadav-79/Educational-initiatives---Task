package Exercise_1.Structural.adapter;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the type of charger you have (1 for Micro-USB): ");
        int chargerType = scanner.nextInt();

        if (chargerType == 1) {
            MicroUSBCharger microUSBCharger = new MicroUSBCharger();
            PowerSocket adapter = new USBTypeCAdapter(microUSBCharger);
            adapter.charge();
        } else {
            System.out.println("Invalid option.");
        }
    }
}
