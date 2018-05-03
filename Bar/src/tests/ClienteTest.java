package tests;

import org.junit.Test;
import static org.junit.Assert.*;

import business.*;

public class ClienteTest {

    private final Cliente clienteTest = new Cliente(22, "024.834.323-55", 'M', "Rodrigo");

    @Test
    public void getIdade() {
        assertEquals(clienteTest.getIdade(), 22);
    }

    @Test
    public void getCpf() {
        assertEquals(clienteTest.getCpf(), "024.834.323-55");
    }

    @Test
    public void getGenero() {
        assertEquals(clienteTest.getGenero(), "M");
    }

    @Test
    public void setIdade(int novaIdade) {
        clienteTest.setIdade(novaIdade);
        assertEquals(clienteTest.getIdade(), novaIdade);
    }

    @Test
    public void setCpf(String cpf) {
        clienteTest.setCpf(cpf);
        assertEquals(clienteTest.getCpf(), cpf);
    }

    @Test
    public void setGenero(char genero) {
        clienteTest.setGenero(genero);
        assertEquals(clienteTest.getGenero(), genero);
    }
}
