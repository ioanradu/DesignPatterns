package singletonEnum;

public class Main {
    public static void main(String[] args) {
        OnlineMusicStore.INSTANCE.play();
        OnlineMusicStore.ANOTHER_INSTANCE.play();
    }
}
