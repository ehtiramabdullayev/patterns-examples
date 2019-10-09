package strategy;

/**
 * @author Ehtiram Etibarovich Abdullayev on 09.10.2019
 * @project patterns-examples
 */
public class MuteQuack implements QuackBehavior{
    public void quack() {
        System.out.println("Can't quack");
    }
}
