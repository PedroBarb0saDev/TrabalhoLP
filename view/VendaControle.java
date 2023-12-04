/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.VendaPhsb;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u09219761190
 */
public class VendaControle extends AbstractTableModel{

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();

    }

    public VendaPhsb getBean(int linha) {
        return (VendaPhsb) lista.get(linha);

    }

    @Override
    public int getRowCount() {
        return lista.size();
        //retorna o número de linhas da tabela
    }

    @Override
    public int getColumnCount() {
        return 4;
        //número de colunas 
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        VendaPhsb vendaPhsb = (VendaPhsb) lista.get(rowIndex);

        if (columnIndex == 0) {

            return vendaPhsb.getIdvendaPhsb();
        }
        if (columnIndex == 1) {
            return vendaPhsb.getDataPhsb();
        }
        if (columnIndex == 2) {
            return vendaPhsb.getValortotalPhsb();
        }
        if (columnIndex == 3) {
            return vendaPhsb.getClientePhsb();
        }
        if (columnIndex == 4) {
            return vendaPhsb.getFkVendedorPhsb();
        }
        
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "ID";
        }
        if (columnIndex == 1) {
            return "Data";
        }
        if (columnIndex == 2) {
            return "Valor_Total";
        }
        if (columnIndex == 3) {
            return "Cliente";
        }
        if (columnIndex == 4) {
            return "Vendedor";
        }
        return "";
    }




}
