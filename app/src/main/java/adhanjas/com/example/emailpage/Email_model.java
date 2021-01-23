package adhanjas.com.example.emailpage;

public class Email_model {
    private int img1,img2;
    private String title,message,time;

    public Email_model(int img1, int img2, String title, String message, String time) {
        this.img1 = img1;
        this.img2 = img2;
        this.title = title;
        this.message = message;
        this.time = time;
    }

    public int getImg1() {
        return img1;
    }

    public void setImg1(int img1) {
        this.img1 = img1;
    }

    public int getImg2() {
        return img2;
    }

    public void setImg2(int img2) {
        this.img2 = img2;
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
}
