import java.util.ArrayList;
import java.util.Scanner;

public class AnimalMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();

        while (true) {
            System.out.print("Enter the name of the animal (or press Enter to stop): ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.print("Is it a dog? (yes/no): ");
            String isDogInput = scanner.nextLine();
            boolean isDog = isDogInput.equalsIgnoreCase("yes");

            animals.add(new Animal(name, isDog));
        }

        for (Animal animal : animals) {
            System.out.println(animal);
        }

        scanner.close();
    }
}