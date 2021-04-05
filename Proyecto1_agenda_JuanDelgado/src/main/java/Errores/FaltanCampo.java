/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Errores;

/**
 *
 * @author Juanjo
 */
public class FaltanCampo extends Exception{
    public FaltanCampo(String message){
        super(message);
    }
}
