//ESTUDIANTES
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.awt.Component;
import javax.swing.JOptionPane;

public class Estudiantes {
    public Estudiantes() {
    }

    public static void main(String[] args) {
        Estudiante est = new Estudiante();
        est.nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
        est.edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante:"));
        est.nota1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la primera nota:"));
        est.nota2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la segunda nota:"));
        est.nota3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tercera nota:"));
        double promedio = est.calcularPromedio();
        if (est.enRiesgo()) {
            JOptionPane.showMessageDialog((Component)null, est.nombre + " está en riesgo académico.\nPromedio: " + promedio);
        } else {
            JOptionPane.showMessageDialog((Component)null, est.nombre + " NO está en riesgo académico.\nPromedio: " + promedio);
        }

    }

    static class Estudiante {
        String nombre;
        int edad;
        double nota1;
        double nota2;
        double nota3;

        Estudiante() {
        }

        public double calcularPromedio() {
            return (this.nota1 + this.nota2 + this.nota3) / (double)3.0F;
        }

        public boolean enRiesgo() {
            return this.calcularPromedio() < (double)3.0F;
        }
    }
}