/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u09219761190
 */
public class PedidosProdutoControle extends AbstractTableModel {

    List lista = new ArrayList();

//    public void setList(List lista) {
//        this.lista = lista;
//        this.fireTableDataChanged();
//    }
//
//    public PedidosProdutos getbean(int index) {
//        return (PedidosProdutos) lista.get(index);
//    }
//
//    public void addbean(PedidosProdutos pedidosProdutos) {
//        lista.add(pedidosProdutos);
//        this.fireTableDataChanged();
//    }
//
//    public void removebean(int index) {
//        lista.remove(index);
//        this.fireTableDataChanged();
//    }
//
//    public void updatebean(int index, PedidosProdutos pedidosProdutos) {
//        lista.set(index, pedidosprodutos);
//        this.fireTableDataChanged();
//    }

    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
