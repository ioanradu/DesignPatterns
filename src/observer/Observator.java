package observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Observator {

    protected String name;
    protected List<Subject> observedSubjectList; // asta e lista vedetei pe care o urmarim
    protected Map<Subject, String> latestMessages;

    public Observator(String name) {
        this.name = name;
        observedSubjectList = new ArrayList<>();
        latestMessages = new HashMap<>();
    }

    public void update(Subject subjectHwoTriggered) {
        if (observedSubjectList.contains(subjectHwoTriggered)) {
            String previousMessage = latestMessages.get(subjectHwoTriggered);
            String currentMessage = subjectHwoTriggered.getLatestPost();

            if (previousMessage == null || previousMessage.compareTo(subjectHwoTriggered.getLatestPost()) != 0) { // inseamna ca nu se repeta ultimul mesaj si atuni il las sa se afiseze
                System.out.println("I am " + this.name + " and I received an update from "
                        + subjectHwoTriggered.getName() + ": "
                        + currentMessage);
                latestMessages.put(subjectHwoTriggered, currentMessage);
            }
        }
    }

    public void follow(Subject subject) { // ii adaug in lista
        observedSubjectList.add(subject);
        subject.addFollower(this);
    }

    public void unfollow(Subject subject) {
        observedSubjectList.remove(subject);
        subject.removeFollower(this);
    }

}
