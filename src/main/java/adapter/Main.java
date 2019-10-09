package adapter;

/**
 * @author Ehtiram Etibarovich Abdullayev on 09.10.2019
 * @project patterns-examples
 */
public class Main {

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();

        WildTurkey wildTurkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("Turkey says ... ");
        wildTurkey.gobble();
        wildTurkey.fly();


        System.out.println("Duck says ... ");
        testDuck(mallardDuck);

        System.out.println("Duckified turkey says ... ");
        testDuck(turkeyAdapter);

    }


    private static void testDuck(Duck duck) {
        duck.fly();
        duck.quack();
    }
}
