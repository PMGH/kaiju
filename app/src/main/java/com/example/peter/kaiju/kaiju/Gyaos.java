package com.example.peter.kaiju.kaiju;

import com.example.peter.kaiju.behaviours.Moveable;

/**
 * Created by Peter on 25/10/2017.
 */

public class Gyaos extends Kaiju implements Moveable {

    public Gyaos(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    //    inherits roar method

    public String move(){
        return "Moves to another street!";
    }
}
