package strategy;

/**
 * @author Ehtiram Etibarovich Abdullayev on 09.10.2019
 * @project patterns-examples
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("Can't fly ! ");
    }
}
