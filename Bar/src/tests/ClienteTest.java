package tests;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class ClienteTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(business.Cliente.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    private final Cliente clienteTest = new Cliente(22, "024.834.323-55", "M", 1, "Rodrigo");

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
    public void setIdade() {
        assertEquals(clienteTest.setIdade(novaIdade), novaIdade);
    }

    @Test
    public void setCpf() {
        assertEquals(clienteTest.setIdade(novoCpf), novoCpf;

    }

    @Test
    public void setGenero() {
        assertEquals(clienteTest.setIdade(novoGenero), novoGenero);

    }
}
