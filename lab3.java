import java.util.Scanner;

// Abstract Printer class
abstract class Printer {
    private String model;

    public Printer(String model) {
        this.model = model;
    }

    public abstract void configuration();

    public void display() {
        System.out.println("Printer Model: " + model);
    }
}

// DotMatrix class extending Printer
class DotMatrix extends Printer {
    public DotMatrix(String model) {
        super(model);
    }

    public void configuration() {
        System.out.println("Dot-matrix Printer configuration:");
        // Add specific configuration details for Dot-matrix printers here
    }
}

// LaserJet class extending Printer
class LaserJet extends Printer {
    public LaserJet(String model) {
        super(model);
    }

    public void configuration() {
        System.out.println("LaserJet Printer configuration:");
        // Add specific configuration details for LaserJet printers here
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Printer printer = null;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Create Dot-matrix Printer");
            System.out.println("2. Create LaserJet Printer");
            System.out.println("3. Display Printer Configuration");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter Dot-matrix Printer model: ");
                    String dotMatrixModel = scanner.nextLine();
                    printer = new DotMatrix(dotMatrixModel);
                    break;
                case 2:
                    System.out.print("Enter LaserJet Printer model: ");
                    String laserJetModel = scanner.nextLine();
                    printer = new LaserJet(laserJetModel);
                    break;
                case 3:
                    if (printer != null) {
                        printer.configuration();
                        printer.display();
                    } else {
                        System.out.println("Please create a printer first.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting the program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}