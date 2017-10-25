package com.example.peter.kaiju.kaiju;

import com.example.peter.kaiju.vehicle.Vehicle;

/**
 * Created by Peter on 25/10/2017.
 */

public abstract class Kaiju {
    private String name;
    private int healthValue;
    private int attackValue;

    public Kaiju(String name, int healthValue, int attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getName() {
        return name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public String roar(){
        return "Roar!";
    }

    public void attack(Vehicle vehicle){
        int vehicleHealth = vehicle.getHealthValue();
        int kaijuAttack = this.getAttackValue();

        if (vehicleHealth > kaijuAttack){
            int newHealth = vehicleHealth - kaijuAttack;
            vehicle.setHealthValue(newHealth);
        }
        else{
            vehicle.setHealthValue(0);
        }
    }

}
