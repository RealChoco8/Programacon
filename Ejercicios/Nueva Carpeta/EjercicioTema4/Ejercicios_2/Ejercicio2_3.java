package ejercicio2_3;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw11
 */
public class Ejercicio2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = JOptionPane.showInputDialog("Teclea una cadena de caracteres");
        char  letra = JOptionPane.showInputDialog("Escribe la letra que quieres que se cuente").charAt(0);        
        int contador =0;
        for(int x= 0; x<cadena.length() ;x++){
            if(cadena.charAt(x) == letra)
                contador++;
             
         }
         JOptionPane.showMessageDialog(null, "El caracter "+letra+" aparece "+contador+" veces en el mensaje " +cadena);    
}
}
