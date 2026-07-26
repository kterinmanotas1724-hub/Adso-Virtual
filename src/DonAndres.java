//DON ANDRES
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.awt.Component;
import javax.swing.JOptionPane;

public class DonAndres {
    int lapiz = 1200;
    int borrador = 500;
    int cuaderno = 4500;
    int lapicero = 2500;
    int corrector = 5000;

    public DonAndres() {
    }

    public void vender() {
        String producto = JOptionPane.showInputDialog("Digite el producto que desea vender:");
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad que desea vender:"));
        double total = (double)0.0F;
        double descuento = (double)0.0F;
        switch (producto.toLowerCase()) {
            case "lapiz":
                total = (double)(this.lapiz * cantidad);
                if (cantidad > 3) {
                    descuento = total * 0.333;
                }

                total -= descuento;
                break;
            case "borrador":
                total = (double)(this.borrador * cantidad);
                if (cantidad >= 2) {
                    descuento = total * 0.1;
                }

                total -= descuento;
                break;
            case "cuaderno":
                total = (double)(this.cuaderno * cantidad);
                if (cantidad > 6) {
                    descuento = total * 0.45;
                }

                total -= descuento;
                break;
            case "lapicero":
                total = (double)(this.lapicero * cantidad);
                if (cantidad > 2 && cantidad < 6) {
                    descuento = total * 0.145;
                }

                total -= descuento;
                break;
            case "corrector":
                total = (double)(this.corrector * cantidad);
                if (cantidad >= 5 && cantidad <= 7) {
                    descuento = total * 0.76;
                }

                total -= descuento;
                break;
            default:
                JOptionPane.showMessageDialog((Component)null, "Producto no encontrado");
                return;
        }

        JOptionPane.showMessageDialog((Component)null, "Cantidad: " + cantidad + "\nDescuento aplicado: $" + descuento + "\nTotal a pagar: $" + total);
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido a la tienda Don Andrés, gracias por tu compra");
        DonAndres tienda = new DonAndres();
        tienda.vender();
    }
}
