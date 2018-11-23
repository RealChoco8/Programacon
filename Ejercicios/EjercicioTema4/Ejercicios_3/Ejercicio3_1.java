package ejercicio3_1;

import javax.swing.JOptionPane;


public class Ejercicio3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sueldo = 0;
        String horas = JOptionPane.showInputDialog("Intoducde las horas trabajadas");
        int h = Integer.parseInt(horas);
        if(h < 40){
            sueldo = h * 10;
            JOptionPane.showMessageDialog(null, "El sueldo que va ha obtener es de "+ sueldo);
        }
        else{
            
        }
            
    }
    
}
