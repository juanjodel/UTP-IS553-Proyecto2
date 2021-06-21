/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidad.Estudiante;

/**
 *
 * @author Juanjo
 */
public interface DaoCajero {
    Estudiante ConsultaSal (String Saldo);
    Estudiante RetiralSal (String Saldo);
    Estudiante ConsignaSal (String cant, String Saldo);
}
