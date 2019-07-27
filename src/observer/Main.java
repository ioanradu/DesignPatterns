package observer;

public class Main {
    public static void main(String[] args) {
        Subject acdc = new RockStar("ACDC");
        Subject holograf = new RockStar("Holograf");

        Observator jon = new Person("Jon");
        Observator jill = new Person("Jill");
        Observator jack = new Hater("Jack");

        jon.follow(acdc);
        jill.follow(acdc);
        jack.follow(acdc);

        jill.follow(holograf);
        jack.follow(holograf);

        acdc.postNewEvent("New concert in September!");
        holograf.postNewEvent("Concert la sala Palatului");
        holograf.postNewEvent("Concert la sala Palatului");
        holograf.postNewEvent("Concert la sala Palatului");
        holograf.postNewEvent("Concert la sala Palatului");
        holograf.postNewEvent("Concert la sala Palatului");
        holograf.postNewEvent("Concert la sala Palatului");
        holograf.postNewEvent("Concert la sala Palatului");
        holograf.postNewEvent("Concert la sala Palatului");
        holograf.postNewEvent("Concert la sala Palatului");
        holograf.postNewEvent("Concert la sala Palatului");

        RussianSpammer russianSpammer = new RussianSpammer("Ivan");
        russianSpammer.setLatestPost("Vote for Trump!");
        jill.update(russianSpammer);
        jill.update(russianSpammer);
        jill.update(russianSpammer);
        jill.update(russianSpammer);
        jill.update(russianSpammer);
        jill.update(russianSpammer);
        jill.update(russianSpammer);
        jill.update(russianSpammer);
        jill.update(russianSpammer);

    }

}
