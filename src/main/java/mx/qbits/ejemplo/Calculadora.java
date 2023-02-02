package mx.qbits.ejemplo;

public class Calculadora {
  public int suma(int a, int b) {
    return a+b;
  }
  public static void main(String...argv) {
    Calculadora c = new Calculadora();
    System.out.println("Resultado: "+ c.suma(2,7));
  }
}
