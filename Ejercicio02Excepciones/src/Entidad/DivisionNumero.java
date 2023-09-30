/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado. 
 */
package Entidad;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionNumero {

    public String num1;
    public String num2;

    public DivisionNumero() {
    }

    public DivisionNumero(String num1, String num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public String getNum2() {
        return num2;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }

    public void division() {
        Scanner leer = new Scanner(System.in);
       
        try {
            System.out.println("Ingrese dos número enteros");
            String num1 = leer.next();
            String num2 = leer.next();
            int numero1 = Integer.parseInt(num1);
            int numero2 = Integer.parseInt(num2);
            int resultado = numero1 / numero2;
            System.out.println(numero1 + " / " + numero2 + " = " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("No se puede realizar la division");
        } catch (NumberFormatException e) {
            System.out.println("Los valores ingresados no son enteros");
        }catch (InputMismatchException e) {
            System.out.println("El valor que ingreso no coincide con el formato esperado");
        }

    }
}
