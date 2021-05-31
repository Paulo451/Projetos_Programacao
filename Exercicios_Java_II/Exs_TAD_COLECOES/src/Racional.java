public class Racional {
    private int numerador;
    private int denominador;

    //construtor
    public Racional(int num, int den)
    {
        this.numerador = num; //this para chamar o private ali de cima
        this.denominador = den;
        this.simplificar();
    }
    //Getters
    public int getNumerador()
    {
        return this.numerador;
    }

    public int getDenominador()
    {
        return this.denominador;
    }

    //seters
    public void setRacional(int num, int den)
    {
        this.numerador = num;
        this.denominador = den;
        this.simplificar();
    }

    //Operações matemáticas
    public Racional multiplicacao(Racional R)
    {
        int auxNum, auxDen;

        auxNum = this.numerador * R.getNumerador();
        auxDen = this.denominador * R.getDenominador();

        Racional M = new Racional(auxNum, auxDen);

        M.simplificar();

        return M;
    }

    public Racional divisao(Racional R)
    {
        int auxNum, auxDen;

        auxNum = this.numerador * R.getDenominador();
        auxDen = this.denominador * R.getNumerador();

        Racional D = new Racional(auxNum, auxDen);

        D.simplificar();

        return D;
    }

    public Racional soma(Racional R)
    {
        int auxNum, auxDen;

        auxDen = this.denominador*R.getDenominador();
        auxNum = this.numerador * R.getDenominador() +
                this.denominador * R.getNumerador();

        Racional S = new Racional(auxNum, auxDen);
        S.simplificar();
        return S;
    }

    public Racional subtracao(Racional R)
    {
        int auxNum, auxDen;

        auxDen = this.denominador*R.getDenominador();
        auxNum = this.numerador * R.getDenominador() -
                this.denominador * R.getNumerador();

        Racional S = new Racional(auxNum, auxDen);
        S.simplificar();
        return S;
    }

    private void simplificar()
    {
        for(int i = this.denominador; i > 1; i--)
        {
            if(this.numerador % i == 0 && this.denominador % i == 0)
            {
                this.numerador = this.numerador/i;
                this.denominador = this.denominador/i;
                break;
            }
        }
    }

    public String toString()
    {
        if(this.denominador == 1)
        {
            return "" + this.numerador;
        }else
            {
                return this.numerador + "/" + this.denominador;
            }

    }
}
