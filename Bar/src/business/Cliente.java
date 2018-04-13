package business;

public class Cliente {

    private int idade;
    private String cpf;
    private char genero;

    public Cliente(int idade, String cpf, char genero) {
        this.idade = idade;
        this.cpf = cpf;
        this.genero = genero;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getCpf() {
        return this.cpf;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        String genero;

        if(this.genero == 'm') genero = "masculino";
        else genero = "feminino";

        return "CPF: " + this.cpf + "\nIdade: " + this.idade + "\nGênero: " + genero;
    }
}
