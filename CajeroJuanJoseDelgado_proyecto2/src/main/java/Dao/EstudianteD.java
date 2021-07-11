/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidad.Estudiante;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juanjo
 */
public class EstudianteD implements DaoEstudiante{
    
    List<Estudiante> ListaEstudiante;

    public EstudianteD() {
        ListaEstudiante = new ArrayList<>();
    }

   

    
    
    @Override
    public Estudiante ConsultaSal(String Codigo,String Saldo) {
        for(Estudiante gbEstudiante:ListaEstudiante){
            if (gbEstudiante.getNumcuenta().equals(Codigo)) {
                return gbEstudiante;
            }
        }
        return null;
    }

    @Override
    public int RetiralSal(String Codigo,String Saldo,String Clave) {
       for(Estudiante gbEstudiante:ListaEstudiante){
            if (gbEstudiante.getNumcuenta().equals(Codigo)) {
                if (gbEstudiante.getClave().equals(Clave)) {
                    if (Integer.parseInt(Saldo)< gbEstudiante.getSaldo()) {
                    gbEstudiante.setSaldo(gbEstudiante.getSaldo()-Integer.parseInt(Saldo));
                    }
                return 1;
                }
            }
                    
        }
       return 0;
    }
     

    @Override
    public Estudiante ConsignaSal(String Codigo,String Saldo) {
              for(Estudiante gbEstudiante:ListaEstudiante){
            if (gbEstudiante.getNumcuenta().equals(Codigo)) {
                    gbEstudiante.setSaldo(gbEstudiante.getSaldo()+Integer.parseInt(Saldo));
                return gbEstudiante;
            }
        }
        return null; 
    }

    @Override
    public Estudiante NuevoEstudiante(String Codigo, String Saldo, String Clave) {
        Estudiante addestudiante = new Estudiante(Codigo,Integer.valueOf(Saldo),Clave);
        ListaEstudiante.add(addestudiante);
        return addestudiante;
    }

    @Override
    public boolean  EliminarEstudiante(String Codigo) {
        Estudiante estu= new Estudiante();
        for (Estudiante estudiante : ListaEstudiante) {
            if (Codigo.equals(estudiante.getNumcuenta())) {
                
                estu = estudiante;
                
            }
        }
        return ListaEstudiante.remove(estu);
        
    }
    
}
