package ejercicio3_3;

import javax.swing.JOptionPane;

public class Ejercicio3_3 {

    public static void main(String[] args) {
        boolean opcion = false;
        
        String dia = JOptionPane.showInputDialog("1.- Sumar dos numeros /2.- Restar dos numeros /3.-Visualizar la tabla de multiplicar de un numero /4.- Visualizar el cociente y el resto de una division /5-Salir del programa.");
        int n1 = Integer.parseInt(dia);
        
        switch(n1){
            case 1:
                int suma = 0;
                String numero1 = JOptionPane.showInputDialog("Introduce el primer numero");
                int nu1 = Integer.parseInt(numero1);
                String numero2 = JOptionPane.showInputDialog("Introduce el primer numero");
                int nu2 = Integer.parseInt(numero2);
                suma = nu1 +nu2;
                JOptionPane.showMessageDialog(null, "La suma es "+suma);
                opcion = false;
                
            break;
            case 2:
                int resta = 0;
                String numeroDos = JOptionPane.showInputDialog("Introduce el primer numero");
                int num1 = Integer.parseInt(numeroDos);
                String numeroDoss = JOptionPane.showInputDialog("Introduce el segundo numero");
                int num2 = Integer.parseInt(numeroDoss);
                resta = num1 - num2;
                JOptionPane.showMessageDialog(null, "La resta es "+resta);
                opcion = false;
            
            case 3:
                int cifra1;
                
            
            case 4:
            
            case 5:
            
        }
            
            
    }
    
}

