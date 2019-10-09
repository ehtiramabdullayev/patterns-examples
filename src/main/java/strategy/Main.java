package strategy;

/**
 * @author Ehtiram Etibarovich Abdullayev on 09.10.2019
 * @project patterns-examples
 */
public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck(new FlyWithWings(), new DefaultQuack());
        Duck rubberDuck = new RubberDuck(new FlyNoWay(), new MuteQuack());

        mallardDuck.performQuack();
        mallardDuck.performQuack();

        rubberDuck.performFly();
        rubberDuck.setFlyBehavior(new FlyWithWings());
        rubberDuck.performFly();
        rubberDuck.performQuack();

    }
}
