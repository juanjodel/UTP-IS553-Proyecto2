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
    private String Saldo;

    public Estudiante() {
    }

    public Estudiante(String Numcuenta, String Clave, String Saldo) {
        this.Numcuenta = Numcuenta;
        this.Clave = Clave;
        this.Saldo = Saldo;
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

    public String getSaldo() {
        return Saldo;
    }

    public void setSaldo(String Saldo) {
        this.Saldo = Saldo;
    }
}
