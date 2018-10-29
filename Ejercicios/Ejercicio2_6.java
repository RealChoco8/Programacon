/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw11
 */
public class Ejercicio2_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    boolean error;
    do{
        try{
            String fecha= JOptionPane.showInputDialog("Teclea una fecha");
            
            error = false;
        }
        catch(Exception e){
            error = true;
        }
    }
    while(error = false);
    }
    
}
