package decorator;

/**
 * @author Ehtiram Etibarovich Abdullayev on 24.09.2019
 * @project oo-principles
 */
public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Cheese(new Olives(new Peppers(new ThickCrustPizza())));
        System.out.println(pizza.getDescription());
        System.out.println(pizza.cost());


        Pizza pizza2 = new Cheese(new Olives(new ThinCrustPizza()));
        System.out.println(pizza2.getDescription());
        System.out.println(pizza2.cost());

    }
}
