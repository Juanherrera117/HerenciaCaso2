package ejecutable;

import javax.swing.JOptionPane;

import modelo.Circulo;
import modelo.Rectangulo;

public class Test 
{
    public static void main(String[] args) 
    {
        //Entrada de datos
        double base = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del base: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la altura: "));
        double radio = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la radio: "));

        //Creacion de un objeto Circulo
        Circulo miCirculo = new Circulo(radio, radio);
        miCirculo.getPerimetro();
        miCirculo.getArea();
        JOptionPane.showMessageDialog(null, "El perimetro del circulo es: " + miCirculo.getPerimetro() + " y su area es: "+ miCirculo.getArea());

        //Creacion de un objeto Rectangulo
        Rectangulo miRectangulo = new Rectangulo(base, altura);
        miRectangulo.getArea();
        miRectangulo.getPerimetro();
        JOptionPane.showMessageDialog(null, "El perimetro del rectangulo es: " + miRectangulo.getPerimetro() + " y su area es: "+ miRectangulo.getArea());
    }    
}
