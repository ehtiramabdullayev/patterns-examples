package decorator;

/**
 * @author Ehtiram Etibarovich Abdullayev on 24.09.2019
 * @project oo-principles
 */
public class ThinCrustPizza implements Pizza {

    public String getDescription() {
        return "Thin Crust Pizza ";
    }

    public int cost() {
        return 10;
    }
}
