package com.mycompany.breve;

import javax.swing.JOptionPane;

public class Punto3 {
   
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el primer valor"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el segundo valor"));
        boolean preparado = false;
        int f=0;
        int resul = 0;
        while(f < num1){
            resul = resul + (num2);
            f++;
        }
        JOptionPane.showMessageDialog(null, "El resultado de la peración es: " + resul);
    }
    
}
