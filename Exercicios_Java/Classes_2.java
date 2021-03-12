public class Classes_2 {
    private double balance; //variavel de instância que armazena o saldo

    //construtor
    public Classes_2( double initialBalance )
    {
        //valida que ititialBalance é maior que zero
        if (initialBalance > 0.0) {
            balance = initialBalance;
        }
    }
   //credita uma quantia na conta
   public void credit( double amount )
   {
        balance = balance + amount;
   }

   //retorna o saldo da conta
    public double getBalance()
    {
        return balance;
    }
}
