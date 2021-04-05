/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafico;

import Clases.Contacto;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juanjo
 */
public class ListaContactos extends DefaultTableModel{
    private final String[] columnas ={"Nombre", "Telefono", "Correo","Direccion", "Alias"};
     private List<Contacto> datos;
     
     public ListaContactos(List<Contacto> datos) {
        this.datos = datos;
        super.setColumnIdentifiers(columnas);
    }
     public void setDatos(List<Contacto> datos) {
        this.datos = datos;
        actualizarDatos();
    }

    public void actualizarDatos() {
        fireTableDataChanged();
    }

    public Contacto getDato(int row) {
        return datos.get(row);
    }

    @Override
    public int getRowCount() {
        return datos == null ? 0 : datos.size();
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        Contacto persona = datos.get(row);
        switch (column) {
            case 0: // Identificacion
                return persona.getNombre();
            case 1: // Nombre
                return persona.getTelefono1()+" "+persona.getTelefono2()+" "+persona.getTelefono3();
            case 2: // Grupo
                return persona.getCorreo();
            case 3://direccion
                return persona.getDireccion();
            case 4: // Estado
                return persona.getAlias();
                
        }
        return super.getValueAt(row, column);
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
    
    @Override
    public Class getColumnClass(int column) {
        switch (column) {
            case 0: 
                return Long.class;
            case 1: 
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
        }
        return super.getColumnClass(column);
    }
    
}
