package ejercicioarrays_1;

import javax.swing.JOptionPane;

public class EjercicioArrays_1 {

    public static void main(String[] args) {
        float [] numeros = new float [10];
        for(int x = 0; x<numeros.length ;x++){
            numeros[x]= Float.parseFloat(JOptionPane.showInputDialog("Introduce un numero"));
        }
        float cantidadMinima = numeros[0];
        float cantidadMaxima = numeros[0];
        
         for (int x = 1; x < numeros.length; x++)
        {
            if (numeros[x] < cantidadMinima)  
                cantidadMinima = numeros[x];
            else
                if (numeros[x] > cantidadMaxima)
                    cantidadMaxima = numeros
                            [x];
        }
          
        JOptionPane.showMessageDialog(null,"El maximo valor  " + cantidadMaxima+ " y el mínimo "+ cantidadMinima);
    }
}
