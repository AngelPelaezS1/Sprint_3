package Level1.Classes;

import Level1.Interface.PizzaBuilder;

import java.util.ArrayList;

public class PizzaHawaiana implements PizzaBuilder {

    private  int size = 25;
    private  String dough = "Italian";
    private ArrayList<String> toppings = new ArrayList<String>();

    @Override
    public PizzaBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    @Override
    public PizzaBuilder setDough(String dough) {
        this.dough = dough;
        return this;
    }

    @Override
    public PizzaBuilder setToppings(String topping) {
        this.toppings.add(topping);
        return this;
    }

    @Override
    public Pizza build() {
        return new Pizza(size, dough, toppings);
    }
}