package ejerciciosarrays8;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;


public class EjerciciosArrays8 {

    //Nieves he intendado hacerlo con un Array de 3X3 para no liarme tanto pero sigue sin salirme.
    public static void main(String[] args) {
        int [] tablaUno = new int[3];
            tablaUno[0]=0;
            tablaUno[1]=0;
            tablaUno[2]=0;
        
        int [] tablaDos = new int[3];
            tablaUno[0]=0;
            tablaUno[1]=0;
            tablaUno[2]=0;    
        
            
            
            
        String Columna = JOptionPane.showInputDialog("Introduce en que columna quieres poner el numero");
        int C = Integer.parseInt(Columna);
        for(C = tablaUno, C>3){
            String Fila = JOptionPane.showInputDialog("Introduce en que fila quieres poner el numero");
        int F = Integer.parseInt(Fila);
            for(F = tablaDos, F>3){
                int suma = tablaUno + tablaDos;
            }
        }
    }
}
            
        
    