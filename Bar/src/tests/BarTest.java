package tests;

import org.junit.Test;
import static org.junit.Assert.*;

import business.*;

public class BarTest {

    private final Cliente clienteTest = new Cliente(22, "024.834.323-55", 'M', "Rodrigo");
    private final Cliente clienteTest2 = new Cliente(23, "026.834.323-55", 'F', "Roberta");
    private final Cliente clienteTest3 = new Socio(23, "028.834.323-55", 'F', 1, "Rodoolfa");

    @Test
    public void addCliente() {
        Bar barTest = new Bar("130418");
        barTest.addCliente(clienteTest);
        assertTrue(barTest.getClientes().contains(clienteTest));
    }

    @Test
    public void removeCliente() {
        Bar barTest = new Bar("130418");
        barTest.addCliente(clienteTest);
        barTest.removeCliente("024.834.323-55");
        assertFalse(barTest.getClientes().contains(clienteTest));
    }

    @Test
    public void estaNoBar() {
        Bar barTest = new Bar("130418");
        barTest.addCliente(clienteTest);
        assertTrue(barTest.estaNoBar("024.834.323-55"));
    }

    @Test
    public void percentualGenero() {
        Bar barTest = new Bar("130418");
        barTest.addCliente(clienteTest);
        barTest.addCliente(clienteTest2);
        assertTrue(barTest.percentualGenero().equals("Mulheres: 50%\n" +
                "Homens: 50%\n"));
    }

    @Test
    public void percentualSocio() {
        Bar barTest = new Bar("130418");
        barTest.addCliente(clienteTest);
        barTest.addCliente(clienteTest3);
        assertTrue(barTest.percentualGenero().equals("Sócios: 50%\n" +
                "Não sócios: 50%\n"));
    }

}
