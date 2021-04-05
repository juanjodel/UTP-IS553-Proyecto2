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
    private List<Contacto> contactos;

    public Agenda() {
        contactos = new ArrayList<>();
    }
   
    public List<Contacto> getContactos() {
        return contactos;
    }
    
    public void agregar (Contacto c){
        int pos = contactos.indexOf(c);
        if(pos != -1){
            contactos.set(pos, c);
        } else {
            contactos.add(c);
        }
    }
    
    public void eliminarContacto(Contacto c){
         contactos.remove(c);
    }
    
    public  void editar(Contacto c,String telefono) {
        for (int i = 0; i < contactos.size(); i++) {
            System.out.println(i);
            if(contactos.get(i).getTelefono1().equals(telefono)){
                contactos.set(i,c);
            }   
        }
    }

    @Override
    public String toString() {
        return "Agenda{" + "contactos=" + contactos + '}';
    }
}
