package Level1.Classes;

import Level1.Interface.PizzaBuilder;

public class MestrePizzer {

        private PizzaBuilder pizzaBuilder;
    public MestrePizzer(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;

    }

    public Pizza buildBarbacoaPizza(){
        return pizzaBuilder
                .setDough("Italian")
                .setSize(30)
                .setToppings("Cheese")
                .setToppings("Pineapple")
                .setToppings("Ham")
                .build();
    }

    public Pizza buildHawaianPizza(){
        return pizzaBuilder
                .setDough("Classic")
                .setSize(40)
                .setToppings("Chesse")
                .setToppings("Bacon")
                .setToppings("BBQ Sauce")
                .build();
    }
}