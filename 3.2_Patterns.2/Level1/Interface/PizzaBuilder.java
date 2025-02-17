package Level1.Interface;

import Level1.Classes.Pizza;

public interface PizzaBuilder {
    PizzaBuilder setSize(int size);
    PizzaBuilder setDough(String dough);
    PizzaBuilder setToppings(String topping);
    Pizza build();
}