
package com.joel.arrays;

import javax.swing.JOptionPane;

public class CrearArrays {
    
    public static float [] crearArrayFloat(){
        int tamaño;
        do{
            tamaño = Integer.parseInt(JOptionPane.showInputDialog("Introduzca o tamaño do array"));
        }while(tamaño < 0);
        float [] array = new float[tamaño];
        for (int i = 0; i < tamaño; i++) {
            array[i] = Float.parseFloat(JOptionPane.showInputDialog("Introduce un valor"));
        }
        return array;
    }
    
    public static int [] crearArrayInt(int tamaño){
        int [] array = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            array[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor"));
        }
        return array;
    }
    
    private static boolean isNumeric(String cadena){
        try {
                Integer.parseInt(cadena);
                return true;
        } catch (NumberFormatException nfe){
                return false;
        }
    }
    
    public static void visualizarArray(float [] array, String cadena){
        for(int i = 0;i < array.length;i++){
            cadena += array[i] + ", ";
        }
        cadena = cadena.substring(0, cadena.length() - 2);
        System.out.println(cadena + "]");
    }
}
