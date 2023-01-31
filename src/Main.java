import java.util.Scanner;

public class Main {
// if class inside class --> should be static
    final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Please enter the number of the habitat you would like to view:");
        int habitatNumber = scanner.nextInt();

        zoo zoo_tour = new zoo(habitatNumber);
        zoo_tour.select_habitat();

        System.out.println("---");
        System.out.println("You've reached the end of the program. To check another habitat, please restart the watcher.");

    }



}