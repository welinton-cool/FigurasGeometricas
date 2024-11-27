
package ec.edu.ec.figurasgeometricas.Cuadrado;

public class Cuadrado {
    public double lado=6.0;
    public double perimetro=3;
    
    public Cuadrado() {
        
    }
    public Cuadrado (double lado) {
        this.lado=lado;
    }
    
    public double calcularPerimetro(){
    
        return 4*lado;
    }
    public double calcularArea() {
        return lado*lado;
    }
    public void imprimir() {
        System.out.println("los lados del cuadrado son: " + lado);
    }

    public void lado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void perimetro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    }
    
    

        
  
   
   
    
    

