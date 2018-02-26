package br.com.htech.coffedecorator.Model;

/**
 * Created by artur.oliveira on 26/02/2018.
 */

public class SteamedMilk extends FlavorDecorador {
    private Drink drink;

    public SteamedMilk(Drink drink){
        this.drink = drink;
    }

    public String getDescription(){
        return drink.getDescription()+", SteamedMilk";
    }

    public double cost(){
        return .10+ drink.cost();
    }

}
