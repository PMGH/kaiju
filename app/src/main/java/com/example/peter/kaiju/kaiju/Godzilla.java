package com.example.peter.kaiju.kaiju;

import com.example.peter.kaiju.behaviours.Moveable;

import static android.R.transition.move;

/**
 * Created by Peter on 25/10/2017.
 */

public class Godzilla extends Kaiju implements Moveable {

    public Godzilla(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    //    overrides roar method
    public String roar(){
        return "Skreeeonk!";
    }

    public String move(){
        return "Moves higher up the building!";
    }

}
