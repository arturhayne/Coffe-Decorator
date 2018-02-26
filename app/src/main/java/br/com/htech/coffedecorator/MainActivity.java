package br.com.htech.coffedecorator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import br.com.htech.coffedecorator.Model.Drink;
import br.com.htech.coffedecorator.Model.FlavorDecorador;
import br.com.htech.coffedecorator.Model.Cream;
import br.com.htech.coffedecorator.Model.Traditional;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Drink drink;
        FlavorDecorador decorador;

        drink = new Traditional();
        decorador = new Cream(drink);


        //System.out.println(decorador.getDescricao());
        //System.out.println(decorador.custo());
    }


}
