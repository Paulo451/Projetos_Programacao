public abstract class Produto {
    protected int codigo;
    protected  String nome;
    protected String fabricante;
    protected int qtdEstoque;
    protected double valorUnit;

    public Produto(int codigo, String nome, String fabricante, double valorUnit) {
        this.codigo = codigo;
        this.nome = nome;
        this.fabricante = fabricante;
        this.qtdEstoque = 0;
        this.valorUnit = valorUnit;
    }

    public double vender(int quantidade)
    {
        if(this.qtdEstoque - quantidade < 0) {
            return -1;
        }else {
            this.qtdEstoque -= quantidade;
            return quantidade * valorUnit;
        }
    }

    public boolean comprar(int quantidade)
    {
        this.qtdEstoque += quantidade;
        return true;
    }

    public String imprimir()
    {
        return String.format("Nome: %s\nCodigo: %d\nFabricante: %s\nQuantidade disponivel no Estoque: %d\n" +
                "Valor Unitário: %.2f\n", nome, codigo, fabricante, qtdEstoque, valorUnit);
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public double getValorUnit() {
        return valorUnit;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setValorUnit(double valorUnit) {
        this.valorUnit = valorUnit;
    }
}
