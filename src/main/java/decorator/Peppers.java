package decorator;

/**
 * @author Ehtiram Etibarovich Abdullayev on 24.09.2019
 * @project oo-principles
 */
public class Peppers implements  ToppingDecorator{
    Pizza pizza;

    public Peppers(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", peppers";
    }

    public int cost() {
        return pizza.cost() + 4;
    }
}
