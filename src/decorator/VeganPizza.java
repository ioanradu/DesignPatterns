package decorator;

public class VeganPizza implements Pizza {

    @Override
    public double getCost() {
        System.out.println("Vegan Pizza: 20 ron");
        return 20;
    }
}
