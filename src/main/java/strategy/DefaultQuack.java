package strategy;

/**
 * @author Ehtiram Etibarovich Abdullayev on 09.10.2019
 * @project patterns-examples
 */
public class DefaultQuack implements  QuackBehavior {
    public void quack() {
        System.out.println("Quack Quack !!! ");
    }
}
