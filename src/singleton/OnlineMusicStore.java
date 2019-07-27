package singleton;

public class OnlineMusicStore {

    private static OnlineMusicStore INSTANCE = null;
    // se poate face de tip eager initialization
    // A doua varianta de singleton -- eager
    // private static final OnlineMusicStore INSTANCE = new OnlineMusicStore();
    private OnlineMusicStore(){
        System.out.println("In Online music store constructor");
    }

    // lazy initialization
    public static OnlineMusicStore getInstance(){
        //daca e prima data cand apelam, creaza obiectul cu new si returneaza-l
        //altfel, returneaza 0biectul creat initial cu new, fara sa mai apelez o data
        // daca e de tip eager if-ul nu mai are sens
        if(INSTANCE == null){
            INSTANCE = new OnlineMusicStore();
        }
        return INSTANCE;
    }

    public void play(){
        System.out.println("play");
    }
}
