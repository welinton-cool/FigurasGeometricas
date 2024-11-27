<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */ 

package ec.edu.ec.figurasgeometricas;

import ec.edu.ec.figurasgeometricas.Rectangulo.Rectangulo;
import ec.edu.ec.figurasgeometricas.Triangulo.Triangulo;

=======

package ec.edu.ec.figurasgeometricas;

import ec.edu.ec.figurasgeometricas.Circulo.Circulo;
import ec.edu.ec.figurasgeometricas.Cuadrado.Cuadrado;
>>>>>>> b0803cea1d8428b974159e902dfaf83e924d78b2

public class FigurasGeometricas {

    public static void main(String[] args) {
<<<<<<< HEAD
        
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
        
        
        
        
         
        
=======
        Circulo objCirculo = new Circulo();
        objCirculo.radio =9.0;
        objCirculo.imprimir();
        
        System.out.println("el area del circulo es: " +objCirculo.calcularArea());
        System.out.println("el perimetro del circulo es: " +objCirculo.calcularPerimetro());
        
        Cuadrado objCuadrado = new Cuadrado ();
        objCuadrado.lado= 4;
        objCuadrado.imprimir();
        
        objCuadrado.lado();
        System.out.println("el area del cuadrado es: " +objCuadrado.calcularArea());
        
        objCuadrado.perimetro();
        System.out.println("el perimetro del cuadrado es: " +objCuadrado.calcularPerimetro()); 
>>>>>>> b0803cea1d8428b974159e902dfaf83e924d78b2
    }
}
