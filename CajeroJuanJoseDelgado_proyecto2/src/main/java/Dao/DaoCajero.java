/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidad.Cajero;

/**
 *
 * @author Juanjo
 */
public interface DaoCajero {
    
    int[] RetiralSal (String Codigo,String Saldo);
    Cajero CarrodeValores (String Codigo,String Billete50Mil,String Billete20Mil,String Billete10Mil,String Billete5Mil,String Billete2Mil);
    Cajero Nuevocajero (String IndentCajero);
}
