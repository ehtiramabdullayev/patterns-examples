package decorator;

/**
 * @author Ehtiram Etibarovich Abdullayev on 24.09.2019
 * @project oo-principles
 */
public class Cheese implements ToppingDecorator {
    Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", cheese";
    }

    public int cost() {
        return pizza.cost() + 2;
    }
}
