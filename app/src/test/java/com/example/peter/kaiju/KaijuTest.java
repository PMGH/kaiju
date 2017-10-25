package com.example.peter.kaiju;

import com.example.peter.kaiju.kaiju.Gyaos;
import com.example.peter.kaiju.kaiju.Godzilla;
import com.example.peter.kaiju.vehicle.Jet;
import com.example.peter.kaiju.vehicle.Tank;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Peter on 25/10/2017.
 */

public class KaijuTest {

    Godzilla godzilla;
    Gyaos gyaos;
    Tank tank;
    Jet jet;

    @Before
    public void before(){
        godzilla = new Godzilla("Zilly", 200, 80);
        gyaos = new Gyaos("Gadji", 150, 70);
        tank = new Tank("Mammoth", 120, 100);
        jet = new Jet("Ki-84", 90, 60);
    }

//    Godzilla tests

    @Test
    public void godzillaHasName() {
        assertEquals("Zilly", godzilla.getName());
    }

    @Test
    public void godzillaHasHealthValue() {
        assertEquals(200, godzilla.getHealthValue());
    }

    @Test
    public void godzillahasAttackValue() {
        assertEquals(80, godzilla.getAttackValue());
    }

    @Test
    public void godzillaCanRoar(){
        assertEquals("Skreeeonk!", godzilla.roar());
    }

    @Test
    public void godzillaCanAttackTank(){
        godzilla.attack(tank);
        assertEquals(40, tank.getHealthValue());
    }

    @Test
    public void godzillaCanDestroyTank__healthZero(){
        godzilla.attack(tank);
        godzilla.attack(tank);
        assertEquals(0, tank.getHealthValue());
    }

    @Test
    public void godzillaCanAttackJet__healthZero(){
        godzilla.attack(jet);
        assertEquals(10, jet.getHealthValue());
    }

    @Test
    public void godzillaCanDestroyJet(){
        godzilla.attack(jet);
        godzilla.attack(jet);
        assertEquals(0, jet.getHealthValue());
    }

    @Test
    public void godzillaCanMove(){
        assertEquals("Moves higher up the building!", godzilla.move());
    }


//    Gyaos tests


    @Test
    public void gyaosHasName(){
        assertEquals("Gadji", gyaos.getName());
    }

    @Test
    public void gyaosHasHealthValue(){
        assertEquals(150, gyaos.getHealthValue());
    }

    @Test
    public void gyaosHasAttackValue(){
        assertEquals(70, gyaos.getAttackValue());
    }

    @Test
    public void gyaosCanRoar(){
        assertEquals("Roar!", gyaos.roar());
    }

    @Test
    public void gyaosCanAttackTank(){
        gyaos.attack(tank);
        assertEquals(50, tank.getHealthValue());
    }

    @Test
    public void gyaosCanDestroyTank__healthZero(){
        gyaos.attack(tank);
        gyaos.attack(tank);
        assertEquals(0, tank.getHealthValue());
    }

    @Test
    public void gyaosCanAttackJet__healthZero(){
        gyaos.attack(jet);
        assertEquals(20, jet.getHealthValue());
    }

    @Test
    public void gyaosCanDestroyJet(){
        gyaos.attack(jet);
        gyaos.attack(jet);
        assertEquals(0, jet.getHealthValue());
    }

    @Test
    public void gyaosCanMove(){
        assertEquals("Moves to another street!", gyaos.move());
    }
}
