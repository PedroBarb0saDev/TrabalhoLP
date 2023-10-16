/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import bean.VendedorPhsb;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class VendedorControle extends AbstractTableModel{
     private List lista;
    
    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
        
    }
    
    public VendedorPhsb getBean(int linha) {
        return (VendedorPhsb) lista.get(linha);
        //M.P R.NúmLinha 
          
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
       
    }

    @Override
    public int getColumnCount() {
        return 4;
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
       VendedorPhsb vendedorPhsb = (VendedorPhsb) lista.get(rowIndex);
         
        if (columnIndex == 0) {
       
            return vendedorPhsb.getIdVendedorPhsb();
        }
        if (columnIndex == 1) {
            return vendedorPhsb.getNomePhsb();
        }
        if (columnIndex == 2) {
            return vendedorPhsb.getCpfPhsb();
        }
        if (columnIndex == 3) {
            return vendedorPhsb.getRgPhsb();
        }
        return "";
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "ID";
        }
        if (columnIndex == 1) {
            return "Nome";
        }
        if (columnIndex == 2) {
            return "Cpf";
        }
        if (columnIndex == 3) {
            return "Rg";
        }
        return "";
    }
}