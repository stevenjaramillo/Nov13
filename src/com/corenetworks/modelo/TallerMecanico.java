package com.corenetworks.modelo;

public class TallerMecanico implements ITaller {


    @Override
    public String reparar(Coche c) {
        return "El coche se esta reparando... " + c.getMatricula();
    }
}
