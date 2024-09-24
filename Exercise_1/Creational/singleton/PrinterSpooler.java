package Exercise_1.Creational.singleton;


public class PrinterSpooler {
    // A private static instance of the PrinterSpooler
    private static PrinterSpooler instance;

    // Private constructor to prevent instantiation from outside the class
    private PrinterSpooler() {
        System.out.println("Printer Spooler is ready!");
    }

    // Method to return the singleton instance of the PrinterSpooler
    public static PrinterSpooler getInstance() {
        if (instance == null) {
            instance = new PrinterSpooler();
        }
        return instance;
    }

    // Method to simulate adding a document to the print queue
    public void addPrintJob(String document) {
        System.out.println("Adding document to print queue: " + document);
    }

    // Method to simulate processing the print queue
    public void processPrintQueue() {
        System.out.println("Processing the print queue...");
    }
}

