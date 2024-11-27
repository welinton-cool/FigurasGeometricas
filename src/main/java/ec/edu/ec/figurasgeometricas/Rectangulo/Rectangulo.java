package ec.edu.ec.figurasgeometricas.Rectangulo;

public class Rectangulo {
    
    public double altura;
    public double base;

    public Rectangulo() {
    }

    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }
    
    
    public void imprimir (){
    
        System.out.println("La alltura de la base es de: " + altura);
        System.out.println("La base de la altura es de: " + base);
        
    }
    
    public double calcularArea(){
        return altura*base;      
    }
    
    public double calcularPerimetro(){
    
        return (2*altura)*(2*base);
    
    }
    
}
