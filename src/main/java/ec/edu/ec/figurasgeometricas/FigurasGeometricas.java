
package ec.edu.ec.figurasgeometricas;

import ec.edu.ec.figurasgeometricas.Circulo.Circulo;
import ec.edu.ec.figurasgeometricas.Cuadrado.Cuadrado;

public class FigurasGeometricas {

    public static void main(String[] args) {
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
    }
}
