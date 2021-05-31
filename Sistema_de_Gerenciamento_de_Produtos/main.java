
import java.time.LocalDate;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        GerenciarProdutos gerenciador = new GerenciarProdutos();
        Scanner entrada = new Scanner(System.in);
        int escolha = 0;

        do {
            System.out.println("============LIVRARIA ANHEMBI============");
            System.out.println("            Seja bem vindo");
            System.out.println("        Digite a opção desejada");
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Remover produto");
            System.out.println("3 - Buscar produto por código");
            System.out.println("4 - Listar produtos");
            System.out.println("5 - Comprar produtos");
            System.out.println("6 - Vender produtos");
            System.out.println("7 - Sair");

            escolha = entrada.nextInt();

            switch (escolha) //MENU
            {
                case (1): //Adicionar Produto
                    System.out.println("Digite o codigo do produto");
                    int codigo = entrada.nextInt();

                    System.out.println("Digite o nome do Produto");
                    String nome = entrada.next();

                    System.out.println("Digite o fabricante do produto");
                    String fabricante = entrada.next();

                    System.out.println("Digite o valor unitário do produto");
                    double valor = entrada.nextDouble();

                    System.out.println("Escolha Qual tipo do Produto adicionar");
                    System.out.println("1 - Eletronico");
                    System.out.println("2 - Móvel");
                    System.out.println("3 - Perecivel");

                    int escolha2 = entrada.nextInt();

                    switch (escolha2)
                    {
                        case 1: // eletronico
                            System.out.println("Digite a voltagem do produto");
                            String voltagem = entrada.next();

                            System.out.println("Digite a potencia do produto");
                            int potencia = entrada.nextInt();

                            System.out.println("Digite a eficiencia do produto");
                            String eficiencia = entrada.next();

                            gerenciador.adicionar(new Eletronico(codigo, nome, fabricante, valor, voltagem, potencia, eficiencia));

                            System.out.println("Produto adicionado com sucesso!");
                            break;

                        case 2:
                            System.out.println("Digite o tipo do material");
                            String tipo = entrada.next();

                            gerenciador.adicionar(new Movel(codigo, nome, fabricante, valor, tipo));
                            System.out.println("Produto adicionado com sucesso!");
                            break;

                        case 3:
                            System.out.println("Digite a validade do produto");
                            LocalDate data = LocalDate.ofEpochDay(entrada.nextInt());

                            System.out.println("Digite 1 para é refrigerado e 2 para não");
                            int refrigerado = entrada.nextInt();

                            gerenciador.adicionar(new Perecivel(codigo, nome, fabricante, valor, data, refrigerado == 1));
                            System.out.println("Produto adicionado com sucesso!");
                            break;

                        default:
                            System.out.println("Opção inválida");
                            break;
                    }

                    break;

                case 2: //remover
                    System.out.println("Digite o codigo do produto que deseja remover");
                    int codigoR = entrada.nextInt();

                    System.out.println((gerenciador.remover(codigoR)? "Removido com sucesso" : "Não foi possivel remover o produto"));
                    break;

                case 3:
                    System.out.println("Digite o codigo do produto que deseja buscar");
                    int codigoB = entrada.nextInt();

                    System.out.println((gerenciador.buscarPorCodigo(codigoB) == null)? "Produto não encontrado" : gerenciador.buscarPorCodigo(codigoB).imprimir());
                    break;

                case 4:
                    System.out.println("Digite a opção correspondente");
                    System.out.println("1 - Listar Eletronicos");
                    System.out.println("2 - Listar Pereciveis");
                    System.out.println("3 - Listar Moveis");
                    System.out.println("4 - Listar Estoque menor que");
                    System.out.println("5 - Listar Estoque vazio");
                    System.out.println("6 - Listar por fabricante");
                    System.out.println("7 - Listar por validade");
                    System.out.println("8 - Listar todos os produtos");

                    int escolha3 = entrada.nextInt();

                    switch (escolha3)
                    {
                        case 1:
                            System.out.println(gerenciador.listarEletronicos());
                            break;
                        case 2:
                            System.out.println(gerenciador.listarPereciveis());
                            break;
                        case 3:
                            System.out.println(gerenciador.listarMoveis());
                            break;
                        case 4:
                            System.out.println("Digite a quantidade que desejar para a opção");
                            int qtdOpcao = entrada.nextInt();
                            System.out.println(gerenciador.listarEstoqueMenorQue(qtdOpcao));
                            break;
                        case 5:
                            System.out.println(gerenciador.listarEstoqueVazio());
                            break;
                        case 6:
                            System.out.println("Digite o fabricante desejado para listagem");
                            String fabricante2 = entrada.next();

                            System.out.println(gerenciador.listarPorFabricante(fabricante2));
                            break;
                        case 7:
                            System.out.println("Digite a validade desejada para listagem");
                            LocalDate data2 = LocalDate.ofEpochDay(entrada.nextInt());

                            System.out.println(gerenciador.listarPorValidade(data2));
                            break;
                        case 8:
                            System.out.println(gerenciador.listarTudo());
                            break;

                    }
                break;

                case 5:
                    System.out.println("Digite o código do produto");
                    int codigo3 = entrada.nextInt();

                    System.out.println("Digite a quantidade desejada do produto");
                    int qtd2 = entrada.nextInt();

                    System.out.println((gerenciador.comprarProduto(codigo3, qtd2))? "Produto comprado com sucesso" : "ERRO");

                    break;

                case 6:
                    System.out.println("Digite o código do produto");
                    int codigo4 = entrada.nextInt();

                    System.out.println("Digite a quantidade desejada do produto");
                    int qtd3 = entrada.nextInt();

                    System.out.println((gerenciador.venderProduto(codigo4, qtd3) == -1)?"ERRO" : "Valor da venda: " + gerenciador.venderProduto(codigo4, qtd3));
                    break;
                case 7:
                    escolha = 6;
                    break;
                default:
                    System.out.println("Erro, opção inválida");
            }


        }while (escolha != 6);
    }
}
