package com.corenetworks.presentacion;

import com.corenetworks.modelo.*;

public class ProbarAseguradora {
    public static void main(String[] args) {

        Coche c1 = new Coche("5672 DPB ", " Seat Leon");
        ITaller tMEcanico = new TallerMecanico();
        SeguroCoche s1 = new SeguroCoche(tMEcanico, " Mapfre");
        System.out.println(s1.reparar(c1));
        ITaller tPintura = new TallerPintura();
        s1.setTaller(tPintura);
        System.out.println(s1.reparar(c1));

    }

}
