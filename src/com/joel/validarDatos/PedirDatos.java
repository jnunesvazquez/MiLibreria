
package com.joel.validarDatos;

import javax.swing.JOptionPane;

public class PedirDatos {
    
    public static int validarInt(){
        int dato;
        do{
            dato = Integer.parseInt(JOptionPane.showInputDialog("Dato positivo"));
        }while (dato <= 0);
        return dato;
    }
    
    public static float validarDatos(){
        float dato;
        do{
            dato = Float.parseFloat(JOptionPane.showInputDialog("Dato positivo"));
        }while(dato <= 0);
        return dato;
    }
}
