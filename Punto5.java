
package com.mycompany.breve;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Punto5 {

    
    public static void main(String[] args) {
     ArrayList <String> Listado = new ArrayList <String>(); 
     int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digte el numero que desea calcular"));
     int Factorial = 1;
     String ListadoX = "1";
     for (int s = 2; s <= num; s++){
         
         Factorial = Factorial * s;
        }
     for (int s = 1; s <= num; s++){
       
         Listado.add ("" + s);  
        }
     for (int s = 1; s < num; s++){
         
         ListadoX += "x" + Listado.get (s);
         
        }
     JOptionPane.showMessageDialog(null, "El factorial de "+ num +" = "+ num + "! = "+ ListadoX + " = "+ Factorial);
    }
    
}
