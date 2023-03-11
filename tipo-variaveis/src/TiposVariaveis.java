public class TiposVariaveis {
/**Os oito tipos primitivos são:
 * TIPO    |   MEMÓRIA   |        VALOR MÍNIMO        |      VALOR MÁXIMO 
 * ==============================================================================    
 * int        1 byte       -128                          127
 * byte       2 bytes      -32.768                       32.767
 * short      4 bytes      -2.147.483.648                2.147.483.647
 * long       8 bytes      -9.223.372.036.854.775.808    9.223.372.036.854.775.807
 * float      4 bytes      -3,4028E+38                   3,4028E+38
 * double     8 bytes      -1,7976E+308                  1,7976E+308
 * boolean    true or false
 * char       caractere
 * ==============================================================================
 * Esses tipos não são considerados objetos.
 * São armazenados diretamente na pilha de memória (Memory Stack).
 */

    public static void main(String[] args) throws Exception {
        /*byte idade = 38;
        short ano = 2023;
        int cep = 69090220;
        long cpf = 99999999999L;/*precisa da letra L no final */
       /*  float pi = 3.14F;/*precisa da letra f no final */
       /*  double salario = 2400;*/

        /*constante */
        final float VALOR_PI = 3.14F;/*o 'final' garante que a constate não sera alterada durante o codigo */

        System.out.println(VALOR_PI);
    }
}
