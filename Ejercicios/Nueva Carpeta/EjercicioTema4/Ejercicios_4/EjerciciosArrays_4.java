package ejerciciosarrays_4;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class EjerciciosArrays_4 {

    public static void main(String[] args) {
        try{
            char[] alfabeto= new char[26];
            int  tcont[]= new int[26]; 
 
            inicializarAbecedario(alfabeto);

            inicializarContador(tcont);

            entradaDatos(alfabeto,tcont);

            salidaDatos(alfabeto,tcont);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Problemas de tipo: "+ e.getMessage());
        }
 }

    private static void inicializarAbecedario(char[] alfabeto) throws Exception
    {
        char caracter=97;
        for (int x = 0; x < alfabeto.length; x++)
           alfabeto[x] = caracter++;           
    }

    private static void inicializarContador(int[] tcont) throws Exception
    {
        for (int x = 0; x < tcont.length; x++)
           tcont[x] = 0;
    }

    private static void entradaDatos(char[] alfabeto, int[] tcont) throws Exception
    {
        int y;
        String texto= JOptionPane.showInputDialog("Introducir texto.").toLowerCase();     
        
        for (int x = 0; x < texto.length(); x++)
        {
            y = Arrays.binarySearch(alfabeto, texto.charAt(x));
            if (y != -1)
                tcont[y]=tcont[y]+1;
        } 
    }

    private static void salidaDatos(char[] alfabeto, int[] tcont) throws Exception
    {
        String resultados="";       
        for (int x = 0; x <tcont.length; x++)
        {
           if(tcont[x]!=0)
              resultados = resultados + alfabeto[x] + " - " + tcont[x]+ "\n";
        }
        JOptionPane.showMessageDialog(null, "La frecuencia de las letras es: \n\n" + resultados  ); 
   
    }
    }
    

