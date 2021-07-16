/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fachada;

import Dao.CajeroD;
import Dao.DaoCajero;
import Dao.DaoEstudiante;
import Dao.EstudianteD;
import Entidad.Estudiante;

/**
 *
 * @author Juanjo
 */
public class Fachada {
    private final  DaoCajero DaoCajero ;
    private final DaoEstudiante DaoEstudiante;

    public Fachada(){
        DaoCajero = new CajeroD();
        DaoEstudiante = new EstudianteD();
        DaoCajero.Nuevocajero("1");
        DaoCajero.Nuevocajero("2");
        DaoCajero.Nuevocajero("3");
        DaoCajero.Nuevocajero("4");
    }
    
   
    public int[] RetiroCajero(String IdentCajero,String Numcuenta, String Clave,String CantRetirar){
        if (DaoEstudiante.RetiralSal(Numcuenta, CantRetirar,Clave)) {
            return DaoCajero.RetiralSal(IdentCajero, CantRetirar);  
        }
        System.out.println("aqui esta el error");
        return null;
    }
            
    public boolean CarrodeValoresFacade(String Codigo,String Billete50Mil,String Billete20Mil,String Billete10Mil,String Billete5Mil,String Billete2Mil) {
       return DaoCajero.CarrodeValores( Codigo, Billete50Mil, Billete20Mil, Billete10Mil, Billete5Mil, Billete2Mil);
    }
    public void NuevoEstudiante(String Codigo,String Saldo,String Clave) {
        DaoEstudiante.NuevoEstudiante(Codigo,Saldo,Clave);
    }
    public int ConsultarSalFacade(String Codigo,String Clave) {
        Estudiante Usu= DaoEstudiante.ConsultaSal(Codigo, Clave);
        return Usu.getSaldo();     
    }
    public void ConsignarFacade(String Codigo,String cant) {
        DaoEstudiante.ConsignaSal(Codigo, cant);
    }
    public  boolean EliminarFacade(String Codigo) {
       if(DaoEstudiante.EliminarEstudiante(Codigo)){
           return true;
        }
       return false;
    }
}
