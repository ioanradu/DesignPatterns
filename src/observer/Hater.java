package observer;

public class Hater extends Person {

    public Hater(String name) {
        super(name);
    }

    @Override
    public void update(Subject subjectHwoTriggered) {
        System.out.println("I am " + this.name + " and I recieved an update from "
                + subjectHwoTriggered.getName() + ": "
                + subjectHwoTriggered.getLatestPost()
                + " - I hate this!");
    }
}
