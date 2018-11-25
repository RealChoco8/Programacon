package ejercicioarrays_6;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class EjercicioArrays_6 {

    public static void main(String[] args) {
        int [] dArray = new int[5];
        int [] codArray = new int[5];
        int [] error = new int[5];
        
        asignarValor(dArray, codArray, error);
        
        String valor = menu(dArray, codArray, error);
        JOptionPane.showMessageDialog(null, valor);         
    }
    
    public static void asignarValor(int[] dArray, int[] codArray, int[] error){
        for(int i = 0; i < dArray.length; i++){
            
            String codigo = JOptionPane.showInputDialog(null, "Introduce un codigo de alumno");
            int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un día"));
            int errores = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un número de faltas"));
            
            if(!Arrays.toString(codArray).contains(codigo)){
                codArray[i] = Integer.parseInt(codigo);
                dArray[i] = dia;
                error[i] = errores;
            }
        }
    }
    public static String menu(int[] diaArray, int[] codigoArray, int[] faltasArray){
        String valor = "";
        for(int i = 0; i < codigoArray.length; i++){
            valor += "Alumno: " + codigoArray[i] + "  Día: " + diaArray[i] + "  Faltas: " + faltasArray[i] +"\n";
        }
        return valor;
    }
    
}
