package com.joel.validarDatos;

import javax.swing.JOptionPane;


public class LerDatos {
    
    public static String pedirString(String mensaje){
        return (JOptionPane.showInputDialog(mensaje));
    }
    
    public static int pedirInt(String mensaje){
        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }
}
