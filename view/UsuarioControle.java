/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import bean.UsuarioPhsb;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u09219761190
 */
class UsuarioControle extends AbstractTableModel {
        private List lista;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();

    }

    public UsuarioPhsb getBean(int linha) {
        return (UsuarioPhsb) lista.get(linha);

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

        UsuarioPhsb usuario = (UsuarioPhsb) lista.get(rowIndex);

        if (columnIndex == 0) {

            return usuario.getIdusuarioPhsb();
        }
        if (columnIndex == 1) {
            return usuario.getNomePhsb();
        }
        if (columnIndex == 2) {
            return usuario.getApelidoPhsb();
        }
        if (columnIndex == 3) {
            return usuario.getCpfPhsb();
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
            return "apelido";
        }
        if (columnIndex == 3) {
            return "CPF";
        }
        return "";
    }
}
