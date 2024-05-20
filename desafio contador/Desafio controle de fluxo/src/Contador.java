import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

        int resultado = parametroDois - parametroUm;
        System.out.println("Este é o valor da subtração: " + resultado);

        for (int contador = 1; contador <= resultado; contador++){
            System.out.println("impressão numero: " + contador);
        }
        

        if (parametroUm > parametroDois)
        System.out.println("O primeiro paramentro deve ser menor que o segundo");
    }
    
}
