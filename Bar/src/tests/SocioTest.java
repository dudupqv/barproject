package tests;


import org.junit.Test;
import static org.junit.Assert.*;

import business.*;

public class SocioTest {

    private final Socio socioTest = new Socio(22, "024.834.323-55", 'M', 1, "Rodrigo");

    @Test
    public void getNsocio() {
        assertEquals(socioTest.getNsocio(), 1);
    }

    @Test
    public void setNsocio(int novoNsocio) {
        socioTest.setNsocio(novoNsocio);
        assertEquals(socioTest.getIdade(), novoNsocio);
    }
}
