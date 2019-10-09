package decorator;

/**
 * @author Ehtiram Etibarovich Abdullayev on 24.09.2019
 * @project oo-principles
 */
public class Olives implements ToppingDecorator{

    Pizza pizza;

    public Olives(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", olives";
    }

    public int cost() {
        return pizza.cost() + 3;
    }
}
