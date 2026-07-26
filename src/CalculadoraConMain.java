//CALCULADORA
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)

import java.awt.Component;
import javax.swing.JOptionPane;

public class CalculadoraConMain {
    public CalculadoraConMain() {
    }

    public int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public int restar(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public double dividir(double num1, double num2) {
        if (num2 == (double)0.0F) {
            throw new ArithmeticException("No se puede dividir por cero");
        } else {
            return num1 / num2;
        }
    }
    //Prueba 1
    public static void main(String[] args) {
        CalculadoraConMain calculadora = new CalculadoraConMain();

        String resultado;
        for(boolean continuar = true; continuar; JOptionPane.showMessageDialog((Component)null, resultado)) {
            int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del número 1"));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del número 2"));
            String opcion = JOptionPane.showInputDialog("Seleccione la operación:\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir");
            resultado = "";
            switch (opcion) {
                case "1":
                    int var14 = calculadora.sumar(num1, num2);
                    resultado = "El resultado de la suma es: " + var14;
                    break;
                case "2":
                    int var13 = calculadora.restar(num1, num2);
                    resultado = "El resultado de la resta es: " + var13;
                    break;
                case "3":
                    int var12 = calculadora.multiplicar(num1, num2);
                    resultado = "El resultado de la multiplicación es: " + var12;
                    break;
                case "4":
                    try {
                        double var10000 = calculadora.dividir((double)num1, (double)num2);
                        resultado = "El resultado de la división es: " + var10000;
                    } catch (ArithmeticException e) {
                        resultado = e.getMessage();
                    }
                    break;
                case "5":
                    continuar = false;
                    resultado = "¡Gracias por usar la calculadora!";
                    break;
                default:
                    resultado = "Opción inválida";
            }
        }

    }
}