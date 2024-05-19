
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class processoSeletivo {
    public static void main(String[] args) {
       String [] candidatos ={"Lucas", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Joel"};
    for(String candidato: candidatos){

    }
    
    }
        static void entrandoEmContato(String candidato){
            		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu=false;
		do {
			atendeu= atender();
         continuarTentando = !atendeu;
        if (continuarTentando)
					tentativasRealizadas++;
			else
				System.out.println("CONTATO REALIZADO COM SUCESSO");

		}while(continuarTentando && tentativasRealizadas<3);
		
		if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
		else
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
		
	    }



        static boolean atender(){
            return new Random().nextInt(3)==1;
        }
        static void imprimirSelecionados() {
        String [] candidatos = {"Lucas", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Joel"};
        System.out.println("imprimindo lista de candidatos informando o indice do elemento");
        for(int indice=0; indice < candidatos.length; indice++){
            System.out.println("o candidato de numero" + indice + "é" + candidatos[indice]);
        }
     }
     static void selecaoCandidatos() {
        String [] candidatos = {"Lucas", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Joel"};
    int candidatosSelecionados = 0;
    int candidatosAtual = 0;
    double salarioBase = 2000.0;

    while(candidatosSelecionados < 5) {
        String candidato = candidatos[candidatosAtual];
        double salarioPretendido = valorPretendido();

        System.out.println("O candidato" + candidato + "Solicitou este valor de sario" + salarioPretendido);
        if (salarioBase >= salarioPretendido){
            System.out.println(" o candidato" + candidato + " foi selecionado para a vaga");
            candidatosSelecionados++;
        }
        candidatosAtual++;
    }

    }
        static double valorPretendido(){
            return ThreadLocalRandom.current().nextDouble(1800, 2200);


        }
     static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
        System.out.println("Ligar para candidato");
    } else if (salarioBase == salarioPretendido)
    System.out.println("Aguardando o resultado dos demais candidatos");
        else {
            System.out.println("Ligar enviando contraproposta");
        }
    }
}
