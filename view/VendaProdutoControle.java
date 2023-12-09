/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.VendaProdutoPhsb;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import org.hibernate.loader.custom.Return;
import tools.Util;

/**
 *
 * @author U09219761190
 */
public class VendaProdutoControle extends AbstractTableModel {

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }

    public VendaProdutoPhsb getBean(int linha) {
        return (VendaProdutoPhsb) lista.get(linha);
    }

    public void addBean(VendaProdutoPhsb vendaProdutoPhsb) {
        lista.add(vendaProdutoPhsb);
        this.fireTableDataChanged();
    }

    public void removeBean(int index) {

        lista.remove(index);
        this.fireTableDataChanged();

    }

    public void updateBean(int index, VendaProdutoPhsb vendaProdutoPhsb) {

        lista.set(index, vendaProdutoPhsb);
        this.fireTableDataChanged();

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
        VendaProdutoPhsb vendaProdutoPhsb = (VendaProdutoPhsb) lista.get(rowIndex);
        if (columnIndex == 0) {
            return vendaProdutoPhsb.getIdvendaProdutoPhsb();
        }
        if (columnIndex == 1) {
            return vendaProdutoPhsb.getValorUnitarioPhsb();
        }

        if (columnIndex == 2) {
            return vendaProdutoPhsb.getQuantidadePhsb();
        }

        if (columnIndex == 3) {
            double quantidade = Util.intDouble(vendaProdutoPhsb.getQuantidadePhsb());
            double valor = vendaProdutoPhsb.getValorUnitarioPhsb();

            return quantidade * valor;
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "ID";
        }
        if (columnIndex == 1) {
            return "Valor Unitario";
        }
        if (columnIndex == 2) {
            return "Quantidade";
        }
        if (columnIndex == 3) {
            return "Valor total";
        }
        return "";
    }

}
