package ejercicioarrays_2;



public class EjercicioArrays_2 {

    public static void main(String[] args) {
        String[] meses = {"enero", "febrero","marzo", "abril","mayo", "junio","julio", "agosto","septiembre", "octubre","noviembre", "diciembre"};
        String mes= javax.swing.JOptionPane.showInputDialog("Teclea el mes");
        int x;
        
        for(x = 0; x < meses.length &&  meses[x].compareToIgnoreCase(mes)!= 0; x++){}
        if (x == meses.length)
            javax.swing.JOptionPane.showMessageDialog(null,"Mes no valido");
        else
            javax.swing.JOptionPane.showMessageDialog(null,"Mes correcto");
   
    }
    
}
