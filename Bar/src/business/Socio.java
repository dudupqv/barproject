package business;

public class Socio extends Cliente {

    private int nsocio;

    public Socio(int idade, String cpf, char genero, int nsocio) {
        super(idade, cpf, genero);
        this.nsocio = nsocio;
    }

    public int getNsocio() {
        return this.nsocio;
    }

    public void setNsocio(int nsocio) {
        this.nsocio = nsocio;
    }

}
