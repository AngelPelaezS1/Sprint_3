package Level1.Main;

import Level1.Classes.MestrePizzer;
import Level1.Classes.PizzaBarbacoa;
import Level1.Classes.PizzaHawaiana;
import Level1.Interface.PizzaBuilder;
import Level1.Classes.Pizza;

public class Main {

    public static void main(String[] args) {
            PizzaBuilder barbacoaBuilder = new PizzaBarbacoa();
            MestrePizzer mestreBarbacoa = new MestrePizzer(barbacoaBuilder);
            Pizza pizzaBarbacoa = mestreBarbacoa.buildBarbacoaPizza();
            System.out.println("Pizza Barbacoa: " + pizzaBarbacoa);

            PizzaBuilder hawaianBuilder = new PizzaHawaiana();
            MestrePizzer mestreHawaian = new MestrePizzer(hawaianBuilder);
            Pizza pizzaHawaiana = mestreHawaian.buildHawaianPizza();
            System.out.println("Pizza Hawaiana: " + pizzaHawaiana);
        }

    }