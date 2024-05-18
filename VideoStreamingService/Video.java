package VideoStreamingService;

public abstract class Video {
    private String title;
    private int duration;

    public Video(String title, int duration){
        this.title = title;
        this.duration = duration;
    }

    public abstract void getInfo();

    public void setTitle(String title){
        this.title = title;
    }

    public Object getTitle(){
        return title;
    }

    public void setDuration(int duration){
        this.duration = duration;
    }

    public int getDuration(){
        return duration;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Video{");
        sb.append("title='").append(title).append('\'');
        sb.append(", duration=").append(duration);
        sb.append('}');
        return sb.toString();
    }
}
