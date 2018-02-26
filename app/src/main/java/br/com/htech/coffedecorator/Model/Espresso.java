package br.com.htech.coffedecorator.Model;

/**
 * Created by artur.oliveira on 26/02/2018.
 */

public class Espresso extends Drink {

    public Espresso(){
        this.setDescription("Espresso");
    }

    @Override
    public double cost() {
        return 1.99;
    }

}
