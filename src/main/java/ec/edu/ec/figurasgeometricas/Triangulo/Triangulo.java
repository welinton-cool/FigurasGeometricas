package ec.edu.ec.figurasgeometricas.Triangulo;

public class Triangulo {

    public double lado;
    public double base;

    public Triangulo(double lado, double base) {
        this.lado = lado;
        this.base = base;
    }

    public Triangulo() {
    }

    public Double ipo() {
        return Math.sqrt(base * base + lado * lado);
    }

    public Double area() {
        return Math.sqrt(base * lado) / 2;
    }

    public Double perimetro() {
        return Math.sqrt(2 * base) + lado;
    }

    public void imprimir() {
        System.out.println("lado es " + lado);
        System.out.println("base es " + base);
    }

    public double hipotenusa(){
        return Math.sqrt(Math.pow(base,2)+Math.pow(lado,2));
        
    }

    public String triangulo() {

if (base == lado&&base ==hipotenusa()){
    return "Equilatero";
}else{
    if(base==lado || base ==hipotenusa()|| lado==hipotenusa()){
        return"isoceles";
    }else{
        return"isoceles";
    }
}
       
   
    }

}
