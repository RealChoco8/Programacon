package ejercicio3_2;

import javax.swing.JOptionPane;

public class Ejercicio3_2 {

    public static void main(String[] args) {
        
        int ValidoSQL = JOptionPane.showConfirmDialog(null, "Es apto en SQL?",null, JOptionPane.YES_NO_OPTION);
        int ValidoVisual = JOptionPane.showConfirmDialog(null, "Es apto en Visual?",null, JOptionPane.YES_NO_OPTION);
        int ValidoCobol = JOptionPane.showConfirmDialog(null, "Es apto en Cobol?",null, JOptionPane.YES_NO_OPTION);
        int ValidoJava = JOptionPane.showConfirmDialog(null, "Es apto en Java?",null, JOptionPane.YES_NO_OPTION);
        
        if(ValidoSQL == 0 && ValidoVisual == 0 && ValidoCobol == 0 && ValidoJava == 0)
            JOptionPane.showMessageDialog(null, "Sobresaliente");
        else
        
        if((ValidoSQL == 0 && ValidoCobol == 0) && (ValidoJava == 0 || ValidoVisual ==0))
            JOptionPane.showMessageDialog(null, "Notable");
        else
            
        if(ValidoSQL == 0 && ValidoCobol == 0)
            JOptionPane.showMessageDialog(null, "Bien");
        else
            
       if((ValidoSQL == 0 && ValidoCobol == 1) && (ValidoJava == 0 || ValidoVisual ==0))
           JOptionPane.showMessageDialog(null, "Suficiente");
        else
           
        if(ValidoCobol == 0 && (ValidoJava == 0 || ValidoVisual ==0))
            JOptionPane.showMessageDialog(null, "Suficiente");
        else
            JOptionPane.showMessageDialog(null, "Insuficiente");
    }
    
}
