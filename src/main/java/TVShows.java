public class TVShows {
    private String showName;
    private int numberOfEpisodes;
    private String genre;

    public TVShows(String showName, int numberOfEpisodes, String genre) {
        this.showName = showName;
        this.numberOfEpisodes = numberOfEpisodes;
        this.genre = genre;
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

