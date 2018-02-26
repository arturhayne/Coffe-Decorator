package br.com.htech.coffedecorator.Model;

/**
 * Created by artur.oliveira on 26/02/2018.
 */
public class Traditional extends Drink {

    public Traditional(){
        this.setDescription("Traditional");
    }

    @Override
    public double cost() {
        return .89;
    }

}
