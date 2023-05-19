import java.util.Scanner;

public class Pessoa {
  // public String nome; // Essa linha está de férias, não será utilizada por enquanto
  public int idade; // A idade da pessoa
  public String cartaoVacinaEmDia; // Guarda o status do cartão de vacina
  public String teveSintomasRecentemente; // Indica se a pessoa se sentiu como um zumbi nos últimos dias
  public String teveContatoComPessoasSintomaticas; // Se sim, talvez seja hora de aprender a se afastar dos outros
  public String estaRetornandoViagem; // Sabe o que é melhor do que viajar? Não pegar uma doença contagiosa!
  public int porcentagemInfeccao; // A probabilidade de estar contaminado - cuidado, pode ser contagioso!
  public String orientacaoFinal; // O conselho final para sobreviver a este mundo assustador

  /*
   * public void coletaNome(Pessoa pessoa, Scanner scanner) {
   * System.out.println("\nInforme o seu nome: ");
   * pessoa.nome = scanner.nextLine();
   * }
   */

  public void coletarIdade(Pessoa pessoa, Scanner scanner) {
    System.out.println("\nInforme a sua idade: ");
    pessoa.idade = scanner.nextInt();
  }
}
