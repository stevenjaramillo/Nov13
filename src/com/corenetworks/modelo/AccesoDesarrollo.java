package com.corenetworks.modelo;

public class AccesoDesarrollo implements IDAO{

    @Override
    public String insertar(Cliente c1) {
        return "Inserte el cliente en desarrollo " + c1.getNombre();
    }
}
