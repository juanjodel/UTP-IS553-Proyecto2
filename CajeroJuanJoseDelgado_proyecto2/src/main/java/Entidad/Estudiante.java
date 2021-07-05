/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Juanjo
 */
public class Estudiante {
    private String Numcuenta;
    private String Clave;
    private Integer Saldo;

    public Estudiante() {
    }

    public Estudiante(String Codigo, String Saldo, String Clave) {
       
    }

    public String getNumcuenta() {
        return Numcuenta;
    }

    public void setNumcuenta(String Numcuenta) {
        this.Numcuenta = Numcuenta;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public Integer getSaldo() {
        return Saldo;
    }

    public void setSaldo(Integer Saldo) {
        this.Saldo = Saldo;
    }

    
}
