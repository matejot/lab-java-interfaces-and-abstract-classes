package VideoStreamingService;

public class Main {
    public static void main(String[] args) {


        Movie movie = new Movie("Furiosa", 123, 8.8);
        movie.getInfo();
        System.out.println("==================");
        TvSeries serie = new TvSeries("Fallout", 45, 8);
        serie.getInfo();
    }
}
