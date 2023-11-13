package com.corenetworks.modelo;

public class TallerPintura implements ITaller{

    @Override
    public String reparar(Coche c) {
        return "El coche se está pintando " + c.getMatricula() + "modelo " + c.getModelo();
    }
}
