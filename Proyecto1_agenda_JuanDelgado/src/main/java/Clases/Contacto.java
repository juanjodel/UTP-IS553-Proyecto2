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

    public Contacto(String nombre, String telefono1) {
        this.nombre = nombre;
        this.telefono1 = telefono1;
    }
    public Contacto(){}
    public Contacto(String nombre, String telefono1, String telefono2, String telefono3, String correo, String Direccion, String alias) {
        this.nombre = nombre;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.telefono3 = telefono3;
        this.correo = correo;
        this.Direccion = Direccion;
        this.alias = alias;
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

    
    @Override
    public String toString() {
        return "Contacto{" + "nombre=" + nombre + ", telefono1=" + telefono1 + ", telefono2=" + telefono2 + ", telefono3=" + telefono3 + ", correo=" + correo + ", Direccion=" + Direccion + ", alias=" + alias + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        final Contacto other = (Contacto) obj;
        if (Objects.equals(this.telefono1, other.telefono1) &&this.telefono1 != null) {
            return false;
        }
        if (Objects.equals(this.telefono1, other.telefono2) && this.telefono1 != null) {
            return false;
        }
        if (Objects.equals(this.telefono1, other.telefono3) && this.telefono1 != null) {
            return false;
        }
        if (Objects.equals(this.telefono2, other.telefono1) && this.telefono1 != null) {
            return false;
        }
        if (Objects.equals(this.telefono2, other.telefono2) && this.telefono2 != null) {
            return false;
        }
        if (Objects.equals(this.telefono2, other.telefono3) && this.telefono2 != null) {
            return false;
        }
        if (Objects.equals(this.telefono3, other.telefono1)&& this.telefono1 != null) {
            return false;
        }
        if (Objects.equals(this.telefono3, other.telefono2) && this.telefono2 != null) {
            return false;
        }
        if (Objects.equals(this.telefono3, other.telefono3) && this.telefono3 != null) {
            return false;
        }
        return true;
    }
}
