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
public class SocioTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(business.Socio.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    private final Socio socioTest = new Socio(22, "024.834.323-55", 'M', 1, "Rodrigo");

    @Test
    public void getNsocio() {
        assertEquals(socioTest.getNsocio(), 1);
    }
//
    @Test
    public void setNsocio(int novoNsocio) {
        socioTest.setNsocio(novoNsocio);
        assertEquals(socioTest.getIdade(), novoNsocio);
    }
}
