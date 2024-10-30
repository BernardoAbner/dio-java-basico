package dio.bernardo.candidatura;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;


public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        for (String candidato : candidatos){
            entrandoEmContato(candidato);

        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;}
            else{
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM "+ candidato + " NA "+ tentativasRealizadas + "TENTATIVA");
        }
        else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + " NÚMERO MÁXIMO " + tentativasRealizadas + " REALIZADA" );
        }

    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void ImprimirSelecionados(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

        System.out.println("Imprimindo  a lista de candidatos informando o inidice do elemento.");
        
        for  (int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de número "+ indice + " é " + candidatos[indice]);
        }
        System.out.println("Forma abreviada de interação for each");

        for (String candidato : candidatos ){
            System.out.println("O candidato selecionado foi: "+ candidato);
        }
    }

    static void SelecaoCandidatos(){

        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double SalarioPretendido = ValorPretendido();

            System.out.println("O candidato "+ candidato + " solicitou este valor de salário "+ SalarioPretendido);
            if (salarioBase >= SalarioPretendido ){
                System.out.println("O candidato "+ candidato + " foi selecionado para a vaga");
                candidatosSelecionados ++;
            }
            candidatoAtual ++;
        }
    }
    static double ValorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);

    }


    static void analisarCandidato(double SalarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > SalarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }

        else if (salarioBase == SalarioPretendido){
            System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
        }

        else{
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}