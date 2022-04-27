/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testclientews;

import clientews.servicio.ServicioSumarImplService;
import clientews.servicio.ServicioSumarWS;

/**
 *
 * @author adseglocdom
 */
public class TestSercivicioSumarWS {
    
    public static void main(String[] args) {
        ServicioSumarWS servicioSumarWS = new ServicioSumarImplService().getServicioSumarImplPort();
        System.out.println("Ejecutando servicio sumar ws");
        int x = 6;
        int y = 10;
        int resultado = servicioSumarWS.sumar(x, y);
        System.out.println(resultado);
    }
    
}
