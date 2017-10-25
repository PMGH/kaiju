package com.example.peter.kaiju.behaviours;

import com.example.peter.kaiju.kaiju.Kaiju;

/**
 * Created by Peter on 25/10/2017.
 */

public interface Attackable {
    void attackHead(Kaiju kaiju);

    void attackBody(Kaiju kaiju);
}
