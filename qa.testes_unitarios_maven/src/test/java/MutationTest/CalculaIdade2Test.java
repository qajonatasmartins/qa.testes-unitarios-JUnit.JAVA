package MutationTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import qa.example.Calculo.CalculaIdade;

public class CalculaIdade2Test {

    @Test
    void ct1(){
        CalculaIdade maior = new CalculaIdade(19);
        Assertions.assertTrue(maior.eHMaiorDeIdade(maior.getIdade()));
    }
//    @Test
//    void ct2(){
//        CalculaIdade maior = new CalculaIdade(18);
//        Assertions.assertTrue(maior.eHMaiorDeIdade(maior.getIdade()));
//    }
//
//    @Test
//    void ct3(){
//        CalculaIdade menor = new CalculaIdade(17);
//        Assertions.assertFalse(menor.eHMaiorDeIdade(menor.getIdade()));
//    }

}
