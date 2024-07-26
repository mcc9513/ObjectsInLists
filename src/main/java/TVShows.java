public class TVShows {
    private String showName;
    private int numberOfEpisodes;
    private String genre;

    public TVShows(String showName, int numberOfEpisodes, String genre) {
        this.showName = showName;
        this.numberOfEpisodes = numberOfEpisodes;
        this.genre = genre;
    }


    public TVShows(String showName, String genre) {
        this.showName = showName;
        this.genre = genre;
    }
    public TVShows(String showName, int numberOfEpisodes) {
        this.showName = showName;
        this.numberOfEpisodes = numberOfEpisodes;
    }
    public TVShows(int numberOfEpisodes, String genre) {
        this.numberOfEpisodes = numberOfEpisodes;
        this.genre = genre;
    }
    public TVShows(String genre) {
        this.genre = genre;
    }

    public TVShows(int numberOfEpisodes) {
        this.numberOfEpisodes = numberOfEpisodes;
    }
    public TVShows() {
    }



    public String getShowName() {
        return showName;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "TV Show Name: " + getShowName() + ", Episodes: " + getNumberOfEpisodes() + ", Genre: " + getGenre();
    }
}

