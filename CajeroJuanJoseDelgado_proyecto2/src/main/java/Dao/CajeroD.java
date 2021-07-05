/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidad.Cajero;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juanjo
 */
public class CajeroD implements DaoCajero{

    List<Cajero> cajerolista;

    public CajeroD() {
        cajerolista = new ArrayList<>();
    }

    
    
   

    
   
    @Override
    public int[] RetiralSal(String Codigo, String Saldo) {
        int[]billetes=new int[4];
        int aux = Integer.parseInt(Saldo);
        for (Cajero cajero : cajerolista) {
            if(cajero.getIndentCajero().equals(Codigo)){
                if (aux <= Integer.parseInt(cajero.getMontodispo())){
                    if (aux>=50000){
                        int cant50 = aux/50000;
                        if(cant50<=Integer.parseInt(cajero.getBillete50mil())){
                            billetes[0]=cant50;
                            cajero.setBillete50mil(Integer.toString(Integer.parseInt(cajero.getBillete50mil())-cant50));
                            aux=aux-cant50*50000;
                        }
                    }
                    if (aux>=20000){
                        int cant20 = aux/20000;
                        if(cant20<=Integer.parseInt(cajero.getBillete20mil())){
                            billetes[1]=cant20;
                            cajero.setBillete20mil(Integer.toString(Integer.parseInt(cajero.getBillete20mil())-cant20));
                            aux=aux-cant20*20000;
                        }
                    }
                    if (aux>=10000){
                        int cant10 = aux/10000;
                        if(cant10<=Integer.parseInt(cajero.getBillete10mil())){
                            billetes[2]=cant10;
                            cajero.setBillete10mil(Integer.toString(Integer.parseInt(cajero.getBillete10mil())-cant10));
                            aux=aux-cant10*10000;
                        }
                    }
                    if (aux>=5000){
                        int cant5 = aux/5000;
                        if(cant5<=Integer.parseInt(cajero.getBillete5mil())){
                            billetes[3]=cant5;
                            cajero.setBillete5mil(Integer.toString(Integer.parseInt(cajero.getBillete5mil())-cant5));
                            aux=aux-cant5*5000;
                        }
                    }
                    if (aux>=2000){
                        int cant2 = aux/2000;
                        if(cant2<=Integer.parseInt(cajero.getBillete2mil())){
                            billetes[4]=cant2;
                            cajero.setBillete2mil(Integer.toString(Integer.parseInt(cajero.getBillete2mil())-cant2));
                            aux=aux-cant2*2000;
                        }
                    }
                    
                }
            }
        }
        return billetes;
    }

    @Override
    public Cajero CarrodeValores(String Codigo, String Billete50Mil,String Billete20Mil,String Billete10Mil,String Billete5Mil,String Billete2Mil) {
        for (Cajero cajero : cajerolista) {
            if (cajero.getIndentCajero().equals(Codigo)) {
                cajero.setBillete2mil(Integer.toString(Integer.parseInt(Billete2Mil)+Integer.parseInt(cajero.getBillete2mil())));
                cajero.setBillete5mil(Integer.toString(Integer.parseInt(Billete5Mil)+Integer.parseInt(cajero.getBillete5mil())));
                cajero.setBillete10mil(Integer.toString(Integer.parseInt(Billete10Mil)+Integer.parseInt(cajero.getBillete10mil())));
                cajero.setBillete20mil(Integer.toString(Integer.parseInt(Billete20Mil)+Integer.parseInt(cajero.getBillete20mil())));
                cajero.setBillete50mil(Integer.toString(Integer.parseInt(Billete50Mil)+Integer.parseInt(cajero.getBillete50mil())));
                return cajero;
            }
        }
        return null;
    }

    @Override
    public Cajero Nuevocajero(String IndentCajero) {
        Cajero addcajero = new Cajero(IndentCajero);
        cajerolista.add(addcajero);
        return addcajero;
    }
    
}
