/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juanjo
 */
public class Agenda {
   public List<Contacto> contactos;

    public Agenda() {
        contactos = new ArrayList<>();
    }
   
    public List<Contacto> getContactos() {
        return contactos;
    }

    
    public boolean agregar (Contacto c){
        int contador=0;
        for (int i = 0; i < contactos.size(); i++) {
            if(contactos.get(i).equals(c)){
                contador++;
            }else{
                System.out.println("Ya existe"); 
                return false;
            }
        }
        if (contador==contactos.size()) {
            contactos.add(c);
            System.out.println("Se agrego");
        }
        return true;
    }
    /*
    public void eliminarContacto(Contacto c){
        System.out.println(c.toString()+"se elimino");
         contactos.remove(c);
    }
    */
    public void eliminarPosicion(int p){
        contactos.remove(p);
    }
    public String buscar(String textoBuscar){
        for (int i = 0; i < contactos.size(); i++) {
            if(textoBuscar.equals(contactos.get(i).getNombre()) 
              || textoBuscar.equals(contactos.get(i).getTelefono1())
              || textoBuscar.equals(contactos.get(i).getTelefono2())   
              || textoBuscar.equals(contactos.get(i).getTelefono3())
              || textoBuscar.equals(contactos.get(i).getDireccion())
              || textoBuscar.equals(contactos.get(i).getCorreo())
              || textoBuscar.equals(contactos.get(i).getAlias())){
                return contactos.get(i).toString();
            }
         }
        return null;
    }
    /*
    public  void editar(Contacto c,String telefono) {
        for (int i = 0; i < contactos.size(); i++) {
            System.out.println(i);
            if(contactos.get(i).getTelefono1().equals(telefono)){
                contactos.set(i,c);
            }   
        }
    }
   */
    @Override
    public String toString() {
        return "Agenda{" + "contactos=" + contactos + '}';
    }
}
