package br.com.htech.coffedecorator.Model;

/**
 * Created by artur.oliveira on 26/02/2018.
 */

public class Express extends Drink {

    public Express(){
        this.setDescription("Express");
    }

    @Override
    public double cost() {
        return 1.99;
    }

}
