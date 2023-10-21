/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import bean.ProdutoPhsb;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class ProdutoControle extends AbstractTableModel{
     private List lista;
    
    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
        
    }
    
    public ProdutoPhsb getBean(int linha) {
        return (ProdutoPhsb) lista.get(linha);
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
        
        ProdutoPhsb produtoPhsb = (ProdutoPhsb) lista.get(rowIndex);
         
        if (columnIndex == 0) {
       
            return produtoPhsb.getIdProdutoPhsb();
        }
        if (columnIndex == 1) {
            return produtoPhsb.getNomePhsb();
        }
        if (columnIndex == 2) {
            return produtoPhsb.getTipoPhsb();
        }
        if (columnIndex == 3) {
            return produtoPhsb.getValorPhsb();
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
            return "Tipo";
        }
        if (columnIndex == 3) {
            return "Valor";
        }
        return "";
    }
}