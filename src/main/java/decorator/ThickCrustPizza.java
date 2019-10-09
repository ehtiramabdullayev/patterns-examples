package decorator;

/**
 * @author Ehtiram Etibarovich Abdullayev on 24.09.2019
 * @project oo-principles
 */
public class ThickCrustPizza implements Pizza {

    public String getDescription() {
        return "Thick crust pizza";
    }

    public int cost() {
        return 15;
    }
}
