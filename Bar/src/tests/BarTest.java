//package tests;
//
//import org.jboss.arquillian.container.test.api.Deployment;
//import org.jboss.arquillian.junit.Arquillian;
//import org.jboss.shrinkwrap.api.ShrinkWrap;
//import org.jboss.shrinkwrap.api.asset.EmptyAsset;
//import org.jboss.shrinkwrap.api.spec.JavaArchive;
//import org.junit.runner.RunWith;
//
//import static org.junit.Assert.*;
//
//@RunWith(Arquillian.class)
//public class BarTest {
//    @Deployment
//    public static JavaArchive createDeployment() {
//        return ShrinkWrap.create(JavaArchive.class)
//                .addClass(business.Bar.class)
//                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
//    }
//
//    @org.junit.Test
//    public void addCliente() {
//    }
//
//    @org.junit.Test
//    public void removeCliente() {
//    }
//
//    @org.junit.Test
//    public void getClientes() {
//    }
//
//    @org.junit.Test
//    public void getNumClientes() {
//    }
//
//    @org.junit.Test
//    public void estaNoBar() {
//    }
//
//    @org.junit.Test
//    public void percentualGenero() {
//    }
//
//    @org.junit.Test
//    public void percentualSocio() {
//    }
//
//    @org.junit.Test
//    public void finalizarDia() {
//    }
//}
