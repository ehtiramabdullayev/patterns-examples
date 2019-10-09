package adapter;

/**
 * @author Ehtiram Etibarovich Abdullayev on 09.10.2019
 * @project patterns-examples
 */
public class WildTurkey implements Turkey {
    public void gobble() {
        System.out.println("Gobble gobble gobble !!! ");
    }

    public void fly() {
        System.out.println("I am flying very short distance !!! ");
    }
}
