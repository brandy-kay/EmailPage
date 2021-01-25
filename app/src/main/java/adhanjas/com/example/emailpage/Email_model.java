package adhanjas.com.example.emailpage;

public class Email_model {
    private int imgpic,imgstar;
    private String title,message,time;

    public Email_model(int imgpic, int imgstar, String title, String message, String time) {
        this.imgpic = imgpic;
        this.imgstar = imgstar;
        this.title = title;
        this.message = message;
        this.time = time;
    }

    public int getImgpic() {
        return imgpic;
    }

    public void setImgpic(int imgpic) {
        this.imgpic = imgpic;
    }

    public int getImgstar() {
        return imgstar;
    }

    public void setImgstar(int imgstar) {
        this.imgstar = imgstar;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Email_model{" +
                "imgpic=" + imgpic +
                ", imgstar=" + imgstar +
                ", title='" + title + '\'' +
                ", message='" + message + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
