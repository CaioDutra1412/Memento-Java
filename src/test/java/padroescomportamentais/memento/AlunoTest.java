package padroescomportamentais.memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void amazenarEstados() {
        Codigo codigo = new Codigo();
        codigo.setEstado(CodigoestadoRefPython.getInstance());
        codigo.setEstado(CodigoestadoRefJava.getInstance());
        codigo.setEstado(CodigoestadoRefC.getInstance());
        assertEquals(3, codigo.getEstados().size());
    }

    @Test
    void retornarEstadoInicial() {
        Codigo codigo = new Codigo();
        codigo.setEstado(CodigoestadoRefPython.getInstance());
        codigo.setEstado(CodigoestadoRefC.getInstance());
        codigo.restauraEstado(0);
        assertEquals(CodigoestadoRefPython.getInstance(), codigo.getEstado());
    }

    @Test
    void retornarEstadoAnterior() {
        Codigo codigo = new Codigo();
        codigo.setEstado(CodigoestadoRefPython.getInstance());
        codigo.setEstado(CodigoestadoRefJava.getInstance());
        codigo.setEstado(CodigoestadoRefPython.getInstance());
        codigo.setEstado(CodigoestadoRefC.getInstance());
        codigo.restauraEstado(2);
        assertEquals(CodigoestadoRefPython.getInstance(), codigo.getEstado());
    }

    @Test
    void retornarExcecaoIndiceInvalido() {
        try {
            Codigo codigo = new Codigo();
            codigo.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Escolha um indice válido", e.getMessage());
        }
    }

}