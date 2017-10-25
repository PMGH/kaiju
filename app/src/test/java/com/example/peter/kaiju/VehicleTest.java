package com.example.peter.kaiju;

import com.example.peter.kaiju.kaiju.Godzilla;
import com.example.peter.kaiju.kaiju.Gyaos;
import com.example.peter.kaiju.vehicle.Jet;
import com.example.peter.kaiju.vehicle.Tank;
import com.example.peter.kaiju.vehicle.Vehicle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Peter on 25/10/2017.
 */

public class VehicleTest {

    Tank tank;
    Jet jet;
    Godzilla godzilla;
    Gyaos gyaos;

    @Before
    public void before(){
        tank = new Tank("Mammoth", 120, 100);
        jet = new Jet("Ki-84", 90, 60);
        godzilla = new Godzilla("Zilly", 200, 80);
        gyaos = new Gyaos("Gadji", 150, 70);
    }

//    Tank tests

    @Test
    public void tankHasType(){
        assertEquals("Mammoth", tank.getType());
    }

    @Test
    public void tankHasHealthValue(){
        assertEquals(120, tank.getHealthValue());
    }

    @Test
    public void tankHasAttackValue(){
        assertEquals(100, tank.getAttackValue());
    }

    @Test
    public void tankCanMove(){
        assertEquals("Trundles forward to engage.", tank.move());
    }

    @Test
    public void tankCanAttackHead__failedHeadshot(){
        tank.attackHead(godzilla);
        assertEquals(200, godzilla.getHealthValue());
    }

    @Test
    public void tankCanAttackBody(){
        tank.attackBody(godzilla);
        assertEquals(100, godzilla.getHealthValue());
    }

    @Test
    public void tankCantOverkill(){
        tank.attackBody(gyaos);
        tank.attackBody(gyaos);
        assertEquals(0, gyaos.getHealthValue());
    }


//    Jet tests

    @Test
    public void jetHasType(){
        assertEquals("Ki-84", jet.getType());
    }

    @Test
    public void jetHasHealthValue(){
        assertEquals(90, jet.getHealthValue());
    }

    @Test
    public void jetHasAttackValue(){
        assertEquals(60, jet.getAttackValue());
    }

    @Test
    public void jetCanMove(){
        assertEquals("Fires up engines and flies overhead.", jet.move());
    }

    @Test
    public void jetCanAttackHead__headshot(){
        jet.attackHead(gyaos);
        assertEquals(0, gyaos.getHealthValue());
    }

    @Test
    public void jetCanAttackBody__kamikaze(){
        jet.attackBody(gyaos);
        assertEquals(90, gyaos.getHealthValue());
        assertEquals(0, jet.getHealthValue());
    }

    @Test
    public void jetCantOverkill(){
        jet.attackBody(gyaos);
        jet.attackBody(gyaos);
        jet.attackBody(gyaos);
        assertEquals(0, gyaos.getHealthValue());
    }
}
