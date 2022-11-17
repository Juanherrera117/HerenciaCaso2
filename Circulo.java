package modelo;

public class Circulo extends Figura
{
    //Atributos 
    private double radio;

    //Constructor 
    public Circulo(double perimetro, double area) 
    {
        super(perimetro, area);
    }    

    //Metodos calcularAreaPerimetro
    public void setPerimetro()
   {
    this.perimetro = 2*radio*3.14;
   }
    public double getPerimetro()
   {
    return this.perimetro;
   }

   public void setArea() 
   {
    this.area = 3.14*(Math.pow(radio, 2));
   }

   public double getArea()
   {
    return this.area;
   }
}
