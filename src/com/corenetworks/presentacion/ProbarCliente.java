package com.corenetworks.presentacion;

import com.corenetworks.modelo.AccesoDesarrollo;
import com.corenetworks.modelo.AccesoProduccion;
import com.corenetworks.modelo.Cliente;
import com.corenetworks.modelo.ClienteDao;

public class ProbarCliente {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Steven", "0526");
        AccesoDesarrollo aD1  = new AccesoDesarrollo();
        AccesoProduccion aP1 = new AccesoProduccion();
        ClienteDao cDAO = new ClienteDao();
        cDAO.setConexion(aD1);
        System.out.println(cDAO.insertar(c1));
        cDAO.setConexion(aP1);
        System.out.println(cDAO.insertar(c1));

    }
}
