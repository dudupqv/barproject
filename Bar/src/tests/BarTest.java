package tests;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class BarTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(business.Bar.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    private final Bar barTest = new Bar("13/04/2018");
    private final Cliente clienteTest = new Cliente(22, "024.834.323-55", "M", 1, "Rodrigo");
    private final Cliente clienteTest2 = new Cliente(23, "026.834.323-55", "F", 2, "Roberta");

    @org.junit.Test
    public void addCliente() {
        barTest.clientes.add(clienteTest);
        bar.Test.clientes.contains(clienteTest);
    }

    @org.junit.Test
    public void removeCliente() {
        barTest.clientes.add(clienteTest);
        bar.Test.clientes.remove(clienteTest);
    }

    @org.junit.Test
    public void getClientes() {

    }

    @org.junit.Test
    public void getNumClientes() {
    }

    @org.junit.Test
    public void estaNoBar() {
    }

    @org.junit.Test
    public void percentualGenero() {
    }

    @org.junit.Test
    public void percentualSocio() {
    }

    @org.junit.Test
    public void finalizarDia() {
    }
}
