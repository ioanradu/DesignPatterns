package decorator;

public class Margerita implements Pizza {

    @Override
    public double getCost() {
        System.out.print("Margerita pizza: 15 ron");
        return 15;
    }
}
