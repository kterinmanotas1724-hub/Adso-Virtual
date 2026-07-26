//TRIANGULO
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.awt.Component;
import javax.swing.JOptionPane;

public class Triangulo {
    public Triangulo() {
    }

    public void tipoTriangulo(int lado1, int lado2, int lado3) {
        if (lado1 == lado2 && lado2 == lado3) {
            JOptionPane.showMessageDialog((Component)null, "Es un triángulo equilátero, ya que todos sus lados son iguales");
        } else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
            JOptionPane.showMessageDialog((Component)null, "Es un triángulo escaleno, ya que no todos los lados son iguales");
        } else {
            JOptionPane.showMessageDialog((Component)null, "Es un triángulo isósceles, ya que dos lados son iguales ");
        }

    }

    public static void main(String[] args) {
        int lado1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer lado"));
        int lado2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo lado"));
        int lado3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer lado"));
        Triangulo t1 = new Triangulo();
        t1.tipoTriangulo(lado1, lado2, lado3);
    }
}
