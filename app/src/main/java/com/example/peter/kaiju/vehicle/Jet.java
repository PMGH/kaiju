package com.example.peter.kaiju.vehicle;

import com.example.peter.kaiju.behaviours.Attackable;
import com.example.peter.kaiju.behaviours.Moveable;
import com.example.peter.kaiju.kaiju.Kaiju;

/**
 * Created by Peter on 25/10/2017.
 */

public class Jet extends Vehicle implements Moveable, Attackable {

    public Jet(String type, int healthValue, int attackValue) {
        super(type, healthValue, attackValue);
    }

    public String move(){
        return "Fires up engines and flies overhead.";
    }

    public void attackHead(Kaiju kaiju){
//        successful headshot
        kaiju.setHealthValue(0);
    }

    public void attackBody(Kaiju kaiju){
        int kaijuHealth = kaiju.getHealthValue();
        int vehicleAttack = this.getAttackValue();

        if (kaijuHealth > vehicleAttack){
            int newHealth = kaijuHealth - vehicleAttack;
            kaiju.setHealthValue(newHealth);
        }
        else {
            kaiju.setHealthValue(0);
        }

//        kamikaze
        this.setHealthValue(0);
    }
}
