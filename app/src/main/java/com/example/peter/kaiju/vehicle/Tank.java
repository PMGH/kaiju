package com.example.peter.kaiju.vehicle;


import com.example.peter.kaiju.behaviours.Attackable;
import com.example.peter.kaiju.behaviours.Moveable;
import com.example.peter.kaiju.kaiju.Kaiju;

/**
 * Created by Peter on 25/10/2017.
 */

public class Tank extends Vehicle implements Moveable, Attackable {

    public Tank(String type, int healthValue, int attackValue) {
        super(type, healthValue, attackValue);
    }

    public String move(){
        return "Trundles forward to engage.";
    }

    public void attackHead(Kaiju kaiju){
//        unsuccessful headshot
    }

    public void attackBody(Kaiju kaiju){
//        successful body shot from distance
        int kaijuHealth = kaiju.getHealthValue();
        int vehicleAttack = this.getAttackValue();

        if (kaijuHealth > vehicleAttack){
            int newHealth = kaijuHealth - vehicleAttack;
            kaiju.setHealthValue(newHealth);
        }
        else {
            kaiju.setHealthValue(0);
        }
    }
}
