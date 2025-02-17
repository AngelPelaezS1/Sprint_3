package Level1.Classes;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private int size;
    private String dough;
    private List<String> toppings = new ArrayList<String>();

    public Pizza(int size, String dough, List<String> toppings) {
        this.size = size;
        this.dough = dough;
        this.toppings = toppings;
    }

    public int getSize() {
        return size;
    }

    public String getDough() {
        return dough;
    }

    public List<String> getToppings() {
        return toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", dough='" + dough + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}
