package singletonEnum;

public enum OnlineMusicStore {
    INSTANCE, ANOTHER_INSTANCE;

    public void play(){
        System.out.println("Playing in enum");
    }
}
