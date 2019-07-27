package singletonSyncronized;

public class OnlineMusicStore {

    private static OnlineMusicStore INSTANCE = null;

    // se poate face de tip eager initialization
    // A doua varianta de singleton -- eager
    // private static final OnlineMusicStore INSTANCE = new OnlineMusicStore();
    private OnlineMusicStore() {
        System.out.println("In Online music store constructor");
    }

    //syncronized blocheaza accesul unui al thread la metoda cat timp metoda este deja in uz
    public static /*synchronized*/ OnlineMusicStore getInstance() { // syncronized in semnatura metodei este treia varianta de singleton

        // a patra varianta de singleton este cu blocul syncronized in interiorul metodei, e cea mai buna
        if (INSTANCE == null) {
            synchronized (OnlineMusicStore.class) {
                if (INSTANCE == null) {
                    INSTANCE = new OnlineMusicStore();
                }
            }
        }
        return INSTANCE;
    }

    public void play() {
        System.out.println("Play");
    }
}
