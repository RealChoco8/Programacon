/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioarrays_5;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class EjercicioArrays_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double importe = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduzca el importe"));
        double pago = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduzca la cantidad pagada"));
        double devolucion = Math.abs(importe-pago);
        double[] dinero = {200, 100, 50, 20, 10, 5, 2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01};
        int[] numBilletes = calcularBilletes(devolucion, dinero);
        
        JOptionPane.showMessageDialog(null, "200€: " + numBilletes[0] 
                                    + "\n100€: " + numBilletes[1]
                                    + "\n50€: " + numBilletes[2]
                                    + "\n20€: " + numBilletes[3]
                                    + "\n10€: " + numBilletes[4]
                                    + "\n5€: " + numBilletes[5]
                                    + "\n2€: " + numBilletes[6]
                                    + "\n1€: " + numBilletes[7]
                                    + "\n0,50€: " + numBilletes[8]
                                    + "\n0,20€: " + numBilletes[9]
                                    + "\n0,10€: " + numBilletes[10]
                                    + "\n0,05€: " + numBilletes[11]
                                    + "\n0,02€: " + numBilletes[12]
                                    + "\n0,01€: " + numBilletes[13]);
    }
    
    public static int[] calcularBilletes(double devolucion, double[] dinero){
        int[] numBilletes = new int [30];
        
        for(int i = 0; devolucion > 0.01; i++){
            if(devolucion >= dinero[i]){
                numBilletes[i]++;
                devolucion -= dinero[i];
                System.out.println(devolucion);
                i--;
            }
        }
        return numBilletes;
    }
    
}
