
package ec.edu.ec.figurasgeometricas.Circulo;


public class Circulo {
    public double PI=3.14;
    public double radio=9.0;
    public double area;
    public double perimetro;
    public Circulo() {
    }
    public Circulo(double radio, double PI, double area, double perimetro){
        this.radio=radio;
        this.PI=PI;
        this.area=area;
        this.perimetro=perimetro;   
    }
    public double calcularArea() {
        return area= Math.PI * Math.pow(radio, 2); 
        
    }
    public double calcularPerimetro() {
        return perimetro= 2 * Math.PI * radio;
    }
    
    public void imprimir(){
        System.out.println("el valor del radio del circulo es: " + radio);
        System.out.println("el area del circulo es: " + area);
        System.out.println("el perimetro del circulo es: " + perimetro);
    }
}
   
    
    

