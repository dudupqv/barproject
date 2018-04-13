package business;

public class Cliente {

    private int idade;
    private String cpf;
    private char genero;
    private String nome;

    public Cliente(int idade, String cpf, char genero, String nome) {
        this.nome = nome;
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

    public String getNome(){ return this.nome; }

    public char getGenero() {
        return this.genero;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

        if(this.genero == 'M') genero = "masculino";
        else genero = "feminino";

        return "CPF: " + this.cpf + "\nIdade: " + this.idade + "\nGênero: " + genero;
    }
}
