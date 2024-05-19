
public class processoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo seletivo");
        analisarCandidato(1900.0);
        analisarCandidato(2000.0);
        analisarCandidato(2100.0);
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
