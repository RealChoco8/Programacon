package ejercicio2_4;

import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw11
 */
public class Ejercicio2_4 {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        try{
        String fechaString = JOptionPane.showInputDialog("Teclea una fecha");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yy");
        Date fechaUno = formatter.parse(fechaString);
        
        fechaString = JOptionPane.showInputDialog("Teclea una fecha");
        Date fechaDos = formatter.parse(fechaString);
        
        Long milisegundos = fechaUno.getTime() - fechaDos.getTime();
        
        Long dias = milisegundos / 86400000;
        JOptionPane.showMessageDialog(null , "La diferencia de las fechas es de "+ dias);
    }
    catch(HeadlessException | ParseException e){
        JOptionPane.showMessageDialog(null, "La fecha introducida es incorrecta");
    }
}
}

