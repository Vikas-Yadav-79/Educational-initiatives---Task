package Exercise_1.Creational.singleton;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the singleton instance of the PrinterSpooler
        PrinterSpooler spooler = PrinterSpooler.getInstance();

        // Simulating adding multiple print jobs to the queue
        System.out.println("Enter document name to add to the print queue:");
        String document1 = scanner.nextLine();
        spooler.addPrintJob(document1);

        System.out.println("Enter another document name to add to the print queue:");
        String document2 = scanner.nextLine();
        spooler.addPrintJob(document2);

        // Processing the print queue
        spooler.processPrintQueue();

        // Try to get another instance (it should return the same instance)
        System.out.println("Try to get another instance of Printer Spooler (Press Enter)...");
        scanner.nextLine();
        PrinterSpooler anotherSpooler = PrinterSpooler.getInstance();

        if (spooler == anotherSpooler) {
            System.out.println("Both instances are the same.");
        }

        // Simulate adding another print job
        System.out.println("Enter another document name to add to the print queue:");
        String document3 = scanner.nextLine();
        anotherSpooler.addPrintJob(document3);

        // Processing the print queue again
        anotherSpooler.processPrintQueue();
    }
}
