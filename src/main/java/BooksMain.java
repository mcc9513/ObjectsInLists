import java.util.ArrayList;
import java.util.Scanner;

public class BooksMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Books> books = new ArrayList<>();

        while (true) {
            System.out.print("Enter the name of the book (or press Enter to stop): ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }

            System.out.print("Enter the number of pages: ");
            int pages = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter the publication year: ");
            int publicationYear = Integer.parseInt(scanner.nextLine());

            books.add(new Books(title, pages, publicationYear));
            books.add(new Books(pages, publicationYear));
            books.add(new Books(title, publicationYear));
            books.add(new Books(title, pages));
            books.add(new Books(title));
            books.add(new Books());
        }

        System.out.print("What would you like to print? (everything/name): ");
        String choice = scanner.nextLine();

        for (Books book : books) {
            if (choice.equalsIgnoreCase("everything")) {
                System.out.println(book);
            } else if (choice.equalsIgnoreCase("name")) {
                System.out.println(book.getTitle());
            }
        }

        scanner.close();
    }
}

