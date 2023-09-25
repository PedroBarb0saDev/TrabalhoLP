/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.table.AbstractTableModel;

/**
 *
 * 
 */
public class UsuarioControle extends AbstractTableModel{

    @Override
    public int getRowCount() {
        return 1;
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return "";
    }
    
      @Override
    public String getColumnName(int column){
     if (column == 0 )   {
         return "ID";
    }
     if (column == 1 )   {
         return "Nome";
    }
     if (column == 2 )   {
         return "Apelido";
    }
     if (column == 3 )   {
         return "Senha";
    }
     return null;
    }
}
