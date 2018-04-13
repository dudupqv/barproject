package tests;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

import business.*;

@RunWith(Arquillian.class)
public class ClienteTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(business.Cliente.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

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
