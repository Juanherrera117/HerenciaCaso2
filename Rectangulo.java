package modelo;

public class Rectangulo extends Figura 
{

    //Atributos 
    private double base;
    private double altura;

    //Constructor 
    public Rectangulo(double perimetro, double area) 
    {
        super(perimetro, area);
    }    

    //Metodos calcularAreaPerimetro
    public void setPerimetro()
   {
    this.perimetro = 2*(base + altura);
   }
    public double getPerimetro()
   {
    return this.perimetro;
   }

   public void setArea() 
   {
    this.area = base * altura;
   }
   public double getArea()
   {
    return this.area;
   }
}
