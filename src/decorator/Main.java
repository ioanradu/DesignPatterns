package decorator;

public class Main {
    public static void main(String[] args) {
        Pizza margerita = new Margerita();

        Pizza myCustomPizza = new WithParmesan(margerita);
        System.out.println("\nTotal cost: " + myCustomPizza.getCost());

        Pizza anotherPizza = new WithJalapeno(myCustomPizza);
        System.out.println("\nTotal cost: " + anotherPizza.getCost());

        Pizza extremePizza = new WithParmesan(new WithParmesan(new WithJalapeno(new WithParmesan(anotherPizza))));
        System.out.println("\nTotal cost: " + extremePizza.getCost());

    }
}
