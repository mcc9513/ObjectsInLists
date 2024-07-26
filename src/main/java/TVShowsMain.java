import java.util.ArrayList;
import java.util.Scanner;

public class TVShowsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TVShows> tvShows = new ArrayList<>();

        while (true) {
            System.out.print("Enter the name of the TV show (or press Enter to stop): ");
            String showName = scanner.nextLine();
            if (showName.isEmpty()) {
                break;
            }

            System.out.print("Enter the number of episodes: ");
            int numberOfEpisodes = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter the genre: ");
            String genre = scanner.nextLine();

            tvShows.add(new TVShows(showName, numberOfEpisodes, genre));
        }

        for (TVShows tvShow : tvShows) {
            System.out.println(tvShow);
        }

        scanner.close();
    }
}

