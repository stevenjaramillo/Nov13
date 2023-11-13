package com.corenetworks.modelo;

public class AccesoProduccion implements IDAO{


    @Override
    public String insertar(Cliente c1) {
        return "Inserte el cliente en produccion " + c1.getNombre();
    }
}
