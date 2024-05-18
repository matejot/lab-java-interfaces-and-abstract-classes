package VideoStreamingService;

public class TvSeries extends Video {
    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        this.episodes = episodes;

    }

    private int episodes;

    public int getEpisodes(){
        return episodes;
    }

    @Override
    public void getInfo() {
        System.out.printf("The name of the series: %s\n" +
                          "Duration per episode: %d\n" +
                          "Episodes: %d\n",
                getTitle(), getDuration(), getEpisodes());
    }
}
