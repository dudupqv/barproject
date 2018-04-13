package business;

public class Teste {

    public static void main(String args[]) {
        Cliente a = new Cliente(56, "sdfsdf", 'm');
        Cliente c = new Socio(1, "jkh", 'm', 234234);
        Bar bar = new Bar("2103");
        bar.addCliente(a);
        bar.addCliente(c);
        System.out.println(bar.percentualSocio());
        System.out.println(bar.percentualGenero());
        bar.finalizarDia();
        Bar b = new Bar("2203");
        b.addCliente(new Cliente(9898, "!", 'm'));
        b.finalizarDia();
    }

}
