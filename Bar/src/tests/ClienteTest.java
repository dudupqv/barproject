//package tests;
//
//import org.jboss.arquillian.container.test.api.Deployment;
//import org.jboss.arquillian.junit.Arquillian;
//import org.jboss.shrinkwrap.api.ShrinkWrap;
//import org.jboss.shrinkwrap.api.asset.EmptyAsset;
//import org.jboss.shrinkwrap.api.spec.JavaArchive;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//
//import static org.junit.Assert.*;
//
//@RunWith(Arquillian.class)
//public class ClienteTest {
//    @Deployment
//    public static JavaArchive createDeployment() {
//        return ShrinkWrap.create(JavaArchive.class)
//                .addClass(business.Cliente.class)
//                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
//    }
//
//    @Test
//    public void getIdade() {
//    }
//
//    @Test
//    public void getCpf() {
//    }
//
//    @Test
//    public void getGenero() {
//    }
//
//    @Test
//    public void setIdade() {
//    }
//
//    @Test
//    public void setCpf() {
//    }
//
//    @Test
//    public void setGenero() {
//    }
//}
