package observer;

public class RussianSpammer extends Subject{

    public RussianSpammer(String name) {
        super(name);
    }

    public void setLatestPost(String latestPost) {
        this.latestPost = latestPost;
    }

    public String getLatestPost() {
        return latestPost;
    }
}
