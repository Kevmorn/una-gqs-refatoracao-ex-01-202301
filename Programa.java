import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\tRelatório Auxiliar de Controle de Infecções");

        Pessoa pessoa = coletarDadosPessoa(scanner);

        boolean erroTentativas = Mensagem.realizaPerguntaVacinaEmDia(pessoa);

        Validacao.validarProximasPerguntas(pessoa);

        Validacao.calcularValidacaoFinal(erroTentativas);

        scanner.close();
    }

    private static Pessoa coletarDadosPessoa(Scanner scanner) {
        Pessoa pessoa = new Pessoa();

        pessoa.coletaNome(scanner);
        pessoa.coletaIdade(scanner);

        return pessoa;
    }
}
