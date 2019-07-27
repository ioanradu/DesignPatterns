package decorator;

public class WithParmesan extends PizzaDecorator {
    double parmesanPrice = 3;

    public WithParmesan(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        double initialPrice = pizza.getCost();
        System.out.print(" , with parmesan: 3 ron");
        return initialPrice + parmesanPrice;
    }
}
