package Calculo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import qa.example.Calculo.CalculaIdade;

public class CalculaIdadeTest {

    @Test
    void validaMaiorDeIdade(){
        CalculaIdade maior = new CalculaIdade(19);
        Assertions.assertTrue(maior.eHMaiorDeIdade(maior.getIdade()));
    }

    @Test
    void validaMenorDeIdade(){
        CalculaIdade menor = new CalculaIdade(17);
        Assertions.assertFalse(menor.eHMaiorDeIdade(menor.getIdade()));
    }

    /* Usando técnica de ánalise de valor limite

    1. Passo: Identificar a VARIÁVEL DE ENTRADA da regra de negócio
               Importante: A variável de entrada precisa ser referenciada a um nome
               que generalize todos os valores que são usando.
    2. Passo: Faça uma linha reta e informe o nome da variável de entrada definida

                ----------------------------------
                              Idade
    3. Faça os riscos para separar variáveis válidas e inválidas

                ----------------|-----------------
                              Idade
    4. Identifique os valores da regra de negócio para a técnica de análise de valor limite
                Importante: Lembre-se somente valores numéricos ou sequenciais.

                No caso o valor definido na regra de negocio é "18"
    5.Informe os valores válidos no risquinho da partição.

                ----------------|-----------------
                                18
                              Idade
    6.Identifique o valor que está abaixo e acima dos valores válidos informados nos risquinhos da partição.
                No caso menor que 18 é "17" e maior que 18 é "19".
    7.Informe os valores abaixo das partições válidas

                ----------------|-----------------
                                18
                            17
                              Idade
    8.Informe os valores acima das partições válidas

                ----------------|-----------------
                                18
                            17      19
                              Idade
    9.Crie os casos de testes dos limites e do valor válido da partição.

                ----------------|-----------------
                                18
                            17      19
                              Idade
              Caso de teste 01: 17
              Caso de teste 02: 18
              Caso de teste 03: 19

 Referencia: https://github.com/qajonatasmartins/qa.teste-de-software.MARKDOWN/blob/main/tipos%20de%20testes/teste%20funcional/teste%20de%20caixa%20preta/t%C3%A9cnicas%20de%20caixa%20preta/analise_de_valor_limite.md
    */

    @Test
    void ct01(){
        CalculaIdade menorDeIdade = new CalculaIdade(17);
        Assertions.assertFalse(menorDeIdade.eHMaiorDeIdade(menorDeIdade.getIdade()));
    }

    @Test
    void ct02(){
        CalculaIdade maiorDeIdade1 = new CalculaIdade(18);
        Assertions.assertTrue(maiorDeIdade1.eHMaiorDeIdade(maiorDeIdade1.getIdade()));
    }

    @Test
    void ct03(){
        CalculaIdade maiorDeIdade2 = new CalculaIdade(19);
        Assertions.assertTrue(maiorDeIdade2.eHMaiorDeIdade(maiorDeIdade2.getIdade()));
    }

}
