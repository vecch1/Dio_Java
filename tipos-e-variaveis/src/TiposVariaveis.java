public class TiposVariaveis {
  public static void main(String[] args) throws Exception {
    @SuppressWarnings("unused")
    double salarioMinimo = 2500.33;

    short numeroCurto = 1;
    int numeroNormal = numeroCurto;
    @SuppressWarnings("unused")
    short numeroCurto2 = (short) numeroNormal;

    int numero = 5;

    numero = 10;

    System.out.print(numero);

    @SuppressWarnings("unused")
    final double VALOR_DE_PI = 3.14;
  }
}
