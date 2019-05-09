/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JOptionPane;

class Calculadora{

float operacion (int operacion, float n1, float n2) throws Exception{
float resultado = 0;
switch (operacion){
case 1:
resultado = n1+n2;
break;
case 2:
resultado = n1-n2;
break;
case 3:
resultado = n1*n2;
break;
case 4:
    if (n2==0){
        throw new Exception("No se puede dividir por cero");
    }
resultado = n1/n2;
 


break;
}
return resultado;
}

float operador(int a){
boolean dato1 = false;
String dato;
float operador =0f;

try{
dato = JOptionPane.showInputDialog("Valor " + a);
operador = Float.parseFloat(dato);
}
catch(NumberFormatException ex){
JOptionPane.showMessageDialog(null,"Por favor entre un número válido");
}
return operador;


}
}


