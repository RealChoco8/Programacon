package ejercicioarrays_3;

import javax.swing.JOptionPane;

public class EjercicioArrays_3 {

    public static void main(String[] args) {
        float[] arrayLitrosCaidos = new float[12];
        inicializaArrayLitrosCaidos(arrayLitrosCaidos);
        
        char continuar;
        do
        {
            solicitarDatosEntrada(arrayLitrosCaidos);
            continuar = JOptionPane.showInputDialog("¿Quieres seguir introduciendo datos? <s/n>").toLowerCase().charAt(0);
        }
        while (continuar == 's');
        
        visualizarLitrosCaidos(arrayLitrosCaidos);
    }
    
    public static void inicializaArrayLitrosCaidos(float[] arrayLitrosCaidos)
    {
        for (int x = 0; x < arrayLitrosCaidos.length; x++)
            arrayLitrosCaidos[x] = 0; 
    }

    private static void solicitarDatosEntrada(float[] arrayLitrosCaidos)
    {
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Teclea el mes(del 1 al 12): "));
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Teclea el dia (en numero): "));
      
        
        float litros = Float.parseFloat(JOptionPane.showInputDialog("Teclea los litros caídos: "));
        arrayLitrosCaidos[mes-1] += litros;
    }


    private static void visualizarLitrosCaidos(float[] arrayLitrosCaidos)
    {
        String litrosCaidos = "";
        for (int x = 0; x < arrayLitrosCaidos.length; x++)
        {
          litrosCaidos = litrosCaidos + (x+1) + " - " + arrayLitrosCaidos[x]+ "\n";
  
        }   
       JOptionPane.showMessageDialog(null, "Los litros recogidos durante los doce meses del año son: \n" + litrosCaidos );        
    }
}
