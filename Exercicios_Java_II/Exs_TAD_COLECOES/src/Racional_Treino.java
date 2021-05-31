public class Racional_Treino {
    private int numerador;
    private int denominador;

    public Racional_Treino(int num, int den)
    {
        this.numerador = num;
        this.denominador = den;
        this.simplificar();
    }
    //geters
    public int getNumerador()
    {
        return numerador;
    }
    public int getDenominador()
    {
        return denominador;
    }
    //setters
    public void setRacional(int num, int den)
    {
        this.numerador = num;
        this.denominador = den;
        this.simplificar();
    }

    //Operações
    public Racional_Treino multiplicacao(Racional_Treino R)
    {

        return new Racional_Treino(this.numerador * R.getNumerador(), this.denominador * R.getDenominador());

    }

    public Racional_Treino divisao(Racional_Treino R)
    {
        return new Racional_Treino(this.numerador * R.getDenominador(), this.denominador * R.getNumerador());
    }

    public Racional_Treino soma(Racional_Treino R)
    {
        return new Racional_Treino((this.numerador*R.getDenominador())+(this.denominador*R.getNumerador()), this.denominador*R.getDenominador());
    }

    public Racional_Treino subtracao(Racional_Treino R)
    {
        return new Racional_Treino((this.numerador*R.getDenominador())-(this.denominador*R.getNumerador()), this.denominador*R.getDenominador());
    }

    private void simplificar()
    {
        for(int i = this.denominador; i > 0; i--)
        {
            if(this.denominador % i == 0 && this.numerador % i == 0)
            {
                this.numerador = this.numerador/i;
                this.denominador = this.denominador/i;
                break;
            }
        }
    }
}
