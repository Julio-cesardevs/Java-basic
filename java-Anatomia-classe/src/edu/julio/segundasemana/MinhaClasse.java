package edu.julio.segundasemana;
public class MinhaClasse {
  // Aqui é corpo do meu Método
  public static void main(String[] args) {
    // Aqui vem minha variaveis , operaçoes e expressois etc...

      // declação de variáveis.
    String primeiroNome = "Júlio";
    String segundoNome = "César";
    int numeroVazio;

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

    System.out.println(nomeCompleto);
      
  }

  // declarando um mètodo.
  public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return " Resulatdo do método " + primeiroNome.concat(" ").concat(segundoNome);
  }
}
