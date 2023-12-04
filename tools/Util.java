/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author 09219761190
 */
public class Util {

    public static void habilitar(boolean valor, JComponent... vetcomp) {
        for (int i = 0; i < vetcomp.length; i++) {
            vetcomp[i].setEnabled(valor);
        }
    }

    public static void limparCampos(JComponent... vetComp) {

        for (JComponent componente : vetComp) {
            if (componente instanceof JTextField) {
                JTextField obj = (JTextField) componente;
                obj.setText("");
            } else if (componente instanceof JComboBox) {
                JComboBox obj = (JComboBox) componente;
                obj.setSelectedIndex(-1);
            } else if (componente instanceof JCheckBox) {
                JCheckBox obj = (JCheckBox) componente;
                obj.setSelected(false);
            }
        }

    }

    public static void mensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public static boolean pergunta(String pergunta) {
        JOptionPane.showConfirmDialog(null, pergunta, "Pergunta", JOptionPane.YES_NO_OPTION);

        return false;
    }

    public static int strInt(String cad) {
        return Integer.valueOf(cad);
    }

    public static String intStr(int num) {

        return String.valueOf(num);
    }

    public static double strDouble(String cad) {
        return Double.valueOf(cad);
    }

    public static String doubleStr(double num) {
        return String.valueOf(num);
    }

    public static Date strDate(String data) {
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");
            return formato.parse(data);
        } catch (ParseException ex) {
            System.out.println("erro na conversao");

        }
        return null;
    }

    public static String dateStr(java.util.Date data) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");
        return formato.format(data);
    }

}
