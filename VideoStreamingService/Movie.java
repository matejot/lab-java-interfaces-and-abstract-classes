package VideoStreamingService;

public class Movie extends Video{
    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }

    private double rating;

    public double getRating(){
        return rating;
    }




    @Override
    public void getInfo() {
        System.out.printf("The name of the movie is: %s\n" +
                          "Duration: %d\n" +
                          "Rating: %f\n" ,
                          getTitle(), getDuration(), getRating());

    }
}
