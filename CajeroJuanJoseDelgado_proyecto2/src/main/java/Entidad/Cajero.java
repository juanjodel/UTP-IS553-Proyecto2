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
public class Cajero {
    
    private String IndentCajero;
    private String Billete5mil;
    private String Billete10mil;
    private String Billete20mil;
    private String Billete50mil;
    private String Montodispo;

    public Cajero() {
    }

    public Cajero(String IndentCajero, String Billete5mil, String Billete10mil, String Billete20mil, String Billete50mil, String Montodispo) {
        this.IndentCajero = IndentCajero;
        this.Billete5mil = Billete5mil;
        this.Billete10mil = Billete10mil;
        this.Billete20mil = Billete20mil;
        this.Billete50mil = Billete50mil;
        this.Montodispo = Montodispo;
    }

    public String getIndentCajero() {
        return IndentCajero;
    }

    public void setIndentCajero(String IndentCajero) {
        this.IndentCajero = IndentCajero;
    }

    public String getBillete5mil() {
        return Billete5mil;
    }

    public void setBillete5mil(String Billete5mil) {
        this.Billete5mil = Billete5mil;
    }

    public String getBillete10mil() {
        return Billete10mil;
    }

    public void setBillete10mil(String Billete10mil) {
        this.Billete10mil = Billete10mil;
    }

    public String getBillete20mil() {
        return Billete20mil;
    }

    public void setBillete20mil(String Billete20mil) {
        this.Billete20mil = Billete20mil;
    }

    public String getBillete50mil() {
        return Billete50mil;
    }

    public void setBillete50mil(String Billete50mil) {
        this.Billete50mil = Billete50mil;
    }

    public String getMontodispo() {
        return Montodispo;
    }

    public void setMontodispo(String Montodispo) {
        this.Montodispo = Montodispo;
    }
    
}
