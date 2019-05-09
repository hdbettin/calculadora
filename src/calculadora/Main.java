/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class Main {
    


public static void main(String[] args) {
Calculadora BasiCal = new Calculadora();
String [] tipoOperacion ={"+","-","*","/"};

int operacion = 0;
String dato;
String menu;

float num1=0, num2=0;
boolean salir = false;
menu = "Elige la operación deseada \n1.- SUMA\n2.- RESTA \n3.- MULTIPLICACION\n4.-DIVISION\n5.- SALIR";
while (!salir){
salir = false;
do {
try{
dato = JOptionPane.showInputDialog(menu);
operacion = Integer.parseInt(dato);
}
catch(NumberFormatException ex){
JOptionPane.showMessageDialog(null,"Proporciona un opcion entre 1 y 5.");
}
} while (operacion == 0);

if (operacion != 5){
num1 = BasiCal.operador(1);
num2 = BasiCal.operador(2);

    try {
        JOptionPane.showMessageDialog(null, num1 + " " + tipoOperacion[operacion - 1] + " " + num2 + " = " +
                + BasiCal.operacion(operacion, num1, num2),"Calculadora Basica ",JOptionPane.PLAIN_MESSAGE);
    } catch (Exception ex) {
        System.out.println(ex.getLocalizedMessage());
    }
}

else{
JOptionPane.showMessageDialog(null, "Calculadora Basica, Derechos Reservados", "Calculadora Basica ", JOptionPane.PLAIN_MESSAGE);
salir = true;
}
}
}

}
