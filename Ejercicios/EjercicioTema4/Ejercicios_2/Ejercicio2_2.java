/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_2;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw11
 */
public class Ejercicio2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = JOptionPane.showInputDialog("Teclea una cadena de caracteres");
        invertirCadena(cadena);
    }
    public static void invertirCadena(String cadena){
        StringBuilder cadenaInvertida = new StringBuilder();
        String cadenaInvertida2 ="";
        for(int y = cadena.length()-1; y >= 0; y--){
            cadenaInvertida.append(cadena.charAt(y));
            cadenaInvertida2 = cadenaInvertida2 + cadena.charAt(y);
        }
        JOptionPane.showMessageDialog(null,"la cadena invertida es "+ cadenaInvertida);
    }
}
