package qa.example.Calculo;

public class CalculaIdade {
    public int idade;
    public CalculaIdade(int idade){
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    /**
     * Regra de negocio: Pessoas com idade maior que 18 anos de idade é considerado maior de idade.
     * @param idade - Idade da pessoa
     * @return - Retorna se é maior de idade ou não
     */
    public boolean eHMaiorDeIdade(int idade) {
        if(idade>18){
            return true;
        }
       return false;
    }
}
