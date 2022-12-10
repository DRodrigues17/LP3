import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculadoraTest {

    Calculadora calculadora;

    private final int VALOR_A = 50;

    private final int VALOR_B = 50;

    private final int EXPOENTE = 2;

    private final int ZERO = 0;

    @Before
    public void setup() {
        calculadora = new Calculadora();
    }

    @Test
    public void deveSomarDoisNumerosEResultarEm100() {
        assertEquals(100, calculadora.somar(VALOR_A, VALOR_B));
    }

    @Test
    public void deveSubtrairDoisNumerosCorretamente() {
        assertEquals(0, calculadora.subtrair(VALOR_A, VALOR_B));
    }

    @Test
    public void deveMultiplicarDoisNumerosCorretamente(){
        assertEquals(2500, calculadora.multiplicar(VALOR_A, VALOR_B));
    }

    @Test
    public void deveDividirDoisValoresCorretamente() {
        assertEquals(1, calculadora.dividir(VALOR_A, VALOR_B));
    }

    @Test
    public void deveLancarUnsupportedOperationExceptionAoDividirPorZero() throws UnsupportedOperationException{
        assertThrows(UnsupportedOperationException.class, () -> calculadora.dividir(VALOR_A,ZERO));
    }

    @Test
    public void deveRetornarUmProdutoDeUmaPotenciaDeUmValor(){
        assertEquals(2500, calculadora.potencia(VALOR_A, EXPOENTE));
    }

    @Test
    public void deveRetornarARaizQuadradaDeUmValor(){
        assertEquals(7, calculadora.raizQuadrada(VALOR_A));
    }

    @Test
    public void deveRetornarARaizCubicaDeUmValor(){
        assertEquals(3, calculadora.raizCubica(VALOR_A));
    }
}
