package poo;

public class Menu {

    public static void menuPrincipal() {

        System.out.println("..................................................");
        System.out.println("|            GESTOR DE  CIRCO                    |");
        System.out.println("..................................................");
        System.out.println("| 1 -> Artista                                   |");
        System.out.println("| 2 -> Espetáculo(Bilhetes)                      |");
        System.out.println("| 3 -> Tenda                                     |");
        System.out.println("| 0 -> Sair                                      |");
        System.out.println("..................................................");
        System.out.println("| Escolha uma Opção:                              ");

    }

    public static void menuTenda() {

        System.out.println("...................................................");
        System.out.println("|                     TENDA                       |");
        System.out.println("...................................................");
        System.out.println("| 1  -> Número de Bilhetes                        |");
        System.out.println("| 2  -> Consultar o horário do Espetáculo         |");
        System.out.println("| 3  -> Espetáculo mais visto                     |");
        System.out.println("| 4  -> Total de Bilhetes Vendidos                |");
        System.out.println("| 5  -> Total de Artistas                         |");
        System.out.println("| 6  -> Total de Espetáculos realizados           |");
        System.out.println("| 7  -> Total de Obtido com a venda de ingressos  |");
        System.out.println("| 8  -> Total de de Despesa obtida                |");
        System.out.println("| 9  -> Histórico de vendas                       |");
        System.out.println("| 0  -> Voltar para o menu principal              |");
        System.out.println("...................................................");
        System.out.println("| Escolha uma Opção:	      					  |");

    }

    public static void menuEspetaculo() {

        System.out.println("..................................................");
        System.out.println("|                 ESPETÁCULO                     |");
        System.out.println("..................................................");
        System.out.println("| 1 -> Adicionar novo Espetáculo                 |");
        System.out.println("| 2 -> Bilheteria do Espetáculo                  |");
        System.out.println("| 3 -> Remover Espetáculo                        |");
        System.out.println("| 4 -> Consultar Espetáculo                      |");
        System.out.println("| 5 -> Clonar Espetáculo                         |");
        System.out.println("| 6 -> Apagar todos os Espetáculos               |");
        System.out.println("| 0 -> Voltar para o menu principal              |");
        System.out.println("..................................................");
        System.out.println("| Escolha uma Opção:                              ");

    }

    public static void menuArtista() {

        System.out.println("..................................................");
        System.out.println("|                 ARTISTA                        |");
        System.out.println("..................................................");
        System.out.println("| 1 -> Inserir novo Artista                      |");
        System.out.println("| 2 -> Modificar Artista                         |");
        System.out.println("| 3 -> Remover Artista                           |");
        System.out.println("| 4 -> Aumentar o salário do Artista             |");
        System.out.println("| 5 -> Diminuir o salário do Artista             |");
        System.out.println("| 6 -> Consultar Artista                         |");
        System.out.println("| 7 -> Listar  Artistas                          |");
        System.out.println("| 8 -> Apagar todos os Artistas                  |");
        System.out.println("| 0 -> Voltar para menu principal                |");
        System.out.println("..................................................");
        System.out.println("| Escolha uma Opção:                              ");

    }

    public static void menuBilheteria() {
        System.out.println("..................................................");
        System.out.println("|                 BILHETEIRA                     |");
        System.out.println("..................................................");
        System.out.println("| 1 -> Comprar Bilhete                           |");
        System.out.println("| 2 -> Comprar Bilhete com desconto              |");
        System.out.println("| 3 -> Consultar Bilhete                         |");
        System.out.println("| 0 -> Voltar                                    |");
        System.out.println("..................................................");
        System.out.println("| Escolha uma Opção:                              ");
    }


}
