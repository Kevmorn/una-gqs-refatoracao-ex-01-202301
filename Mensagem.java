import java.util.Scanner;

public class Mensagem {

    public boolean realizaPergunta(String pergunta, Pessoa pessoa, Scanner scanner) {
        int contador = 0;
        boolean erroTentativas = false;

        do {
            System.out.println("\n" + pergunta + " Digite SIM ou NAO:");
            String resposta = scanner.next().toUpperCase();
            if (resposta.equals("SIM") || resposta.equals("NAO")) {
                atribuirResposta(pessoa, pergunta, resposta);
                break;
            } else {
                contador++;
                System.out.println("\nEntrada inválida! Digite SIM ou NAO.");
                if (contador == 3) {
                    erroTentativas = true;
                    break;
                }
            }
        } while (true);

        return erroTentativas;
    }

    private void atribuirResposta(Pessoa pessoa, String pergunta, String resposta) {
        switch (pergunta) {
            case "Seu cartão de vacina está em dia?":
                pessoa.cartaoVacinaEmDia = resposta;
                break;
            case "Teve algum dos sintomas recentemente?":
                pessoa.teveSintomasRecentemente = resposta;
                break;
            case "Teve contato com pessoas com sintomas gripais nos últimos dias?":
                pessoa.teveContatoComPessoasSintomaticas = resposta;
                break;
            case "Está retornando de viagem ao exterior?":
                pessoa.estaRetornandoViagem = resposta;
                break;
            default:
                break;
        }
    }

    public void imprimirRelatorioFinal(Pessoa pessoa) {
        System.out.println("\nNome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.idade + " anos");
        System.out.println("Cartão Vacinal em Dia: " + pessoa.cartaoVacinaEmDia);
        System.out.println("Teve sintomas recentemente: " + pessoa.teveSintomasRecentemente);
        System.out.println("Teve contato com pessoas infectadas: " + pessoa.teveContatoComPessoasSintomaticas);
        System.out.println("Está retornando de viagem ao exterior: " + pessoa.estaRetornandoViagem);
        System.out.println("Porcentagem de infecção: " + pessoa.porcentagemInfeccao);
        System.out.println("Orientação Final: " + pessoa.orientacaoFinal);
    }

    public void imprimirMensagemErro() {
        System.out.println("Não foi possível realizar a ação. Por favor, tente novamente.");
    }
}
/*O método realizaPergunta foi modificado para receber a pergunta como parâmetro. Isso permite reutilizar o método para todas as perguntas e evitar repetições de código.

Adicionou-se o método atribuirResposta para atribuir a resposta da pergunta correspondente ao campo apropriado na instância de Pessoa. Isso evita a repetição de código ao atribuir os valores manualmente em cada pergunta.

O método imprimirRelatorioFinal foi ajustado para usar os campos corretos da classe Pessoa.

O método imprimirMensagemErro foi atualizado para exibir uma mensagem mais genérica em caso de erro.

Essas alterações tornam o código mais limpo, evitam repetições desnecessá */