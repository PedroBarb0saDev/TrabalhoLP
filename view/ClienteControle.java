/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import bean.ClientePhsb;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 *
 */
public class ClienteControle extends AbstractTableModel {
    
    private List lista;
    
    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }
    
    public ClientePhsb getBean(int linha) {
        return (ClientePhsb) lista.get(linha);
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
        ClientePhsb clientePhsb = (ClientePhsb) lista.get(rowIndex);
        if (columnIndex == 0) {
            return clientePhsb.getIdclientePhsb();
        }
        if (columnIndex == 1) {
            return clientePhsb.getCepPhsb();
        }
        if (columnIndex == 2) {
            return clientePhsb.getDataCadastroPhsb();
        }
        if (columnIndex == 3) {
            return clientePhsb.getNomePhsb();
        }
        return "";
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "ID";
        }
        if (columnIndex == 1) {
            return "Cpf";
        }
        if (columnIndex == 2) {
            return "DataCadastro";
        }
        if (columnIndex == 3) {
            return "Nome";
        }
        return "";
    }
}

