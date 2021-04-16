/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Objects;

/**
 *
 * @author Juanjo
 */
public class Contacto {
    private String nombre;
    private String telefono1;
    private String telefono2;
    private String telefono3;
    private String correo;
    private String Direccion;
    private String alias;
    private String lugar;

    public Contacto(String nombre, String telefono1) {
        this.nombre = nombre;
        this.telefono1 = telefono1;
    }
    public Contacto(String nombre, String telefono1, String telefono2, String telefono3, String correo, String Direccion, String alias,String lugar) {
        this.nombre = nombre;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.telefono3 = telefono3;
        this.correo = correo;
        this.Direccion = Direccion;
        this.alias = alias;
        this.lugar = lugar;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getTelefono3() {
        return telefono3;
    }

    public void setTelefono3(String telefono3) {
        this.telefono3 = telefono3;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public String toWrite(){
        return nombre+";"+telefono1+","+telefono2+","+telefono3+";"+correo+";"+Direccion+";"+alias+";"+lugar+";";
    }
    
    @Override
    public String toString() {
        return "nombre:" + nombre + "\n telefono1:" + telefono1 + "\ntelefono2:" + telefono2 + "\n telefono3:" + telefono3 + "\n  correo:" + correo + "\n Direccion:" + Direccion + "\n alias:" + alias +"\n lugar:"+lugar+ '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.telefono1);
        hash = 37 * hash + Objects.hashCode(this.telefono2);
        hash = 37 * hash + Objects.hashCode(this.telefono3);
        return hash;
    }


    @Override
    public boolean equals(Object obj) {
        final Contacto other = (Contacto) obj;
        if (Objects.equals(this.telefono1, other.telefono1) &&!"".equals(this.telefono1) ) {
            return false;
        }
        if (Objects.equals(this.telefono1, other.telefono2) && !"".equals(this.telefono1)) {
            return false;
        }
        if (Objects.equals(this.telefono1, other.telefono3) && !"".equals(this.telefono1)) {
            return false;
        }
        if (Objects.equals(this.telefono2, other.telefono1) && !"".equals(this.telefono1)) {
            return false;
        }
        if (Objects.equals(this.telefono2, other.telefono2) && !"".equals(this.telefono2)) {
            return false;
        }
        if (Objects.equals(this.telefono2, other.telefono3) && !"".equals(this.telefono2)) {
            return false;
        }
        if (Objects.equals(this.telefono3, other.telefono1)&& !"".equals(this.telefono1)) {
            return false;
        }
        if (Objects.equals(this.telefono3, other.telefono2) && !"".equals(this.telefono2)) {
            return false;
        }
        if (Objects.equals(this.telefono3, other.telefono3) && !"".equals(this.telefono3)&& !" ".equals(telefono3)) {
            return false;
        }
        return true;
    }
}
