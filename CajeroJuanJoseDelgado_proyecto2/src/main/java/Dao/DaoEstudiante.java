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
public interface DaoEstudiante {
    Estudiante ConsultaSal (String Codigo,String Saldo);
    int RetiralSal (String Codigo,String Saldo,String Clave);
    Estudiante ConsignaSal (String Codigo,String cant);
    Estudiante NuevoEstudiante (String Codigo,String Saldo,String Clave);
    boolean EliminarEstudiante(String Codigo);
}
