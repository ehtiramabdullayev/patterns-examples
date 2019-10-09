package builder;

/**
 * @author Ehtiram Etibarovich Abdullayev on 09.10.2019
 * @project patterns-examples
 */
public class Main {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizzabuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

        waiter.setPizzaBuilder( hawaiianPizzabuilder );
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();

        System.out.println(pizza);
    }
}
