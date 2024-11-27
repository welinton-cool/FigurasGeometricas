/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */ 

package ec.edu.ec.figurasgeometricas;

import ec.edu.ec.figurasgeometricas.Rectangulo.Rectangulo;
import ec.edu.ec.figurasgeometricas.Triangulo.Triangulo;


public class FigurasGeometricas {

    public static void main(String[] args) {
        
        Rectangulo objRectangulo = new Rectangulo();
        
        
        objRectangulo.altura = 5;
        objRectangulo.base = 10;
        objRectangulo.calcularArea();
        System.out.println("El area del rectangulo es: " + objRectangulo.calcularArea());
        
        objRectangulo.calcularPerimetro();
        System.out.println("El perimetro de rectangulo es: " + objRectangulo.calcularPerimetro());
         
        
        Triangulo objTriangulo = new Triangulo();
        
        objTriangulo.base=3.4;
        objTriangulo.base=5.4;
        objRectangulo.imprimir();
        
        objRectangulo.calcularArea();
        System.out.println("El area del rectangulo es: " + objRectangulo.calcularArea());
        objRectangulo.calcularPerimetro();
        System.out.println("La hipotenusa es :"+objTriangulo.hipotenusa());
        objTriangulo.triangulo();
        System.out.println("El perimetro del rectangulo es: " + objTriangulo.triangulo());
        
        
        
        
         
        
    }
}
