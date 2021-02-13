package com.mycompany.breve;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collections;
public class Inicio {  
    public static void main(String[] args) {
        ArrayList<Integer> numeros= new ArrayList <Integer> ();
        boolean estado = false;
        while (!estado){
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero, si desea salir digite 0 para salir del menú"));
            switch (opcion){
                case 0:
                    estado = true;
                    break;
                default:
                    numeros.add(opcion);
                    break;
            }
        }
        JOptionPane.showMessageDialog(null, "El numero maximo es: "+ Collections.max(numeros));
    }
}
 