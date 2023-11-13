package com.corenetworks.modelo;

public class Conductor1{
    private IVehiculo v1;

    public String conducir(){
        return v1.moverse();
    }

    public Conductor1() {
    }

    public Conductor1(IVehiculo v1) {
        this.v1 = v1;
    }

    public IVehiculo getV1() {
        return v1;
    }

    public void setV1(IVehiculo v1) {
        this.v1 = v1;
    }
}
