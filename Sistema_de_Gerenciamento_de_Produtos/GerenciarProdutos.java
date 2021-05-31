import java.time.LocalDate;
import java.util.ArrayList;

public class GerenciarProdutos {
    ArrayList<Produto> produtos = new ArrayList<>();
    private String concat;

    public void adicionar(Produto p) {
        produtos.add(p);
    }

    public boolean remover(int codigo) {
        for (int i = 0; i < produtos.size(); i++) {
            if(produtos.get(i).codigo == codigo)
            {
                produtos.remove(i);
                return true;
            }
        }
        return false;
    }

    public Produto buscarPorCodigo(int codigo)
    {
        for (int i = 0; i < produtos.size(); i++) {
            if(produtos.get(i).codigo == codigo)
            {
                return produtos.get(i);
            }
        }
        return null;
    }

    public String listarEletronicos()
    {
        concat = "";

        for (int i = 0; i < produtos.size(); i++) {
            if(produtos.get(i) instanceof Eletronico)
            {
                concat += produtos.get(i).imprimir() + "\n";
            }
        }
        return concat;
    }

    public String listarPereciveis()
    {
        concat = "";

        for (int i = 0; i < produtos.size(); i++) {
            if(produtos.get(i) instanceof Perecivel)
            {
                concat += produtos.get(i).imprimir() + "\n";
            }
        }
        return concat;
    }

    public String listarMoveis()
    {
        concat = "";

        for (int i = 0; i < produtos.size(); i++) {
            if(produtos.get(i) instanceof Movel)
            {
                concat += produtos.get(i).imprimir() + "\n";
            }
        }
        return concat;
    }

    public String listarEstoqueMenorQue(int qtdMinima)
    {
        concat = "";

        for (int i = 0; i < produtos.size(); i++) {
            if(produtos.get(i).qtdEstoque < qtdMinima)
            {
                concat += produtos.get(i).imprimir() + "\n";
            }
        }
        return concat;
    }

    public String listarEstoqueVazio()
    {
        concat = "";

        for (int i = 0; i < produtos.size(); i++) {
            if(produtos.get(i).qtdEstoque == 0)
            {
                concat += produtos.get(i).imprimir() + "\n";
            }
        }
        return concat;
    }

    public String listarPorFabricante(String fabricante)
    {
        concat = "";

        for (int i = 0; i < produtos.size(); i++) {
            if(produtos.get(i).fabricante.equals(fabricante))
            {
                concat += produtos.get(i).imprimir() + "\n";
            }
        }
        return concat;
    }

    public String listarPorValidade(LocalDate validade)
    {
        concat = "";

        for (int i = 0; i < produtos.size(); i++) {
            if(((Perecivel) produtos.get(i)).validade == validade)
            {
                concat += produtos.get(i).imprimir() + "\n";
            }
        }
        return concat;
    }

    public double venderProduto(int codigoProduto, int quantidade)
    {
        for (int i = 0; i < produtos.size(); i++) {
            if(produtos.get(i).codigo == codigoProduto)
            {
                return produtos.get(i).vender(quantidade);
            }
        }
        return -1;
    }

    public boolean comprarProduto(int codigoProduto, int quantidade)
    {
        for (int i = 0; i < produtos.size(); i++) {
            if(produtos.get(i).codigo == codigoProduto)
            {
                return produtos.get(i).comprar(quantidade);
            }
        }
        return false;
    }

    public String listarTudo()
    {
        concat = "";

        for (int i = 0; i < produtos.size(); i++) {
            concat += produtos.get(i).imprimir() + "\n";
        }

        return concat;
    }
}
