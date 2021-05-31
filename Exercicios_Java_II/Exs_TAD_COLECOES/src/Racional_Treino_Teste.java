public class Racional_Treino_Teste {
    public static void main(String[] args) {
        Racional_Treino r = new Racional_Treino(1,2);
        Racional_Treino s = new Racional_Treino(1,2);

        r = r.subtracao(s);

        System.out.println(r.getNumerador() + "/" + r.getDenominador());
    }
}
