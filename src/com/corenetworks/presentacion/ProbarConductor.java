package com.corenetworks.presentacion;

import com.corenetworks.modelo.Coche1;
import com.corenetworks.modelo.Conductor1;

public class ProbarConductor {
    public static void main(String[] args) {
        Coche1 c1 = new Coche1(1);
        Conductor1 c2 = new Conductor1(c1);
        System.out.println(c2.conducir());
    }
}
