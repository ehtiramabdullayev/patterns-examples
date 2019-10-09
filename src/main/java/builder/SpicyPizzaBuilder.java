package builder;

/**
 * @author Ehtiram Etibarovich Abdullayev on 09.10.2019
 * @project patterns-examples
 */
    class SpicyPizzaBuilder extends PizzaBuilder {
        public void buildDough() {
            pizza.setDough("pan baked");
        }

        public void buildSauce() {
            pizza.setSauce("hot");
        }

        public void buildTopping() {
            pizza.setTopping("pepperoni+salami");
        }
    }

