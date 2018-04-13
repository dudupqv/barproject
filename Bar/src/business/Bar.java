package business;

import java.util.*;

import persistence.Escritor;

public class Bar {

    private String data;
    private List<Cliente> clientes;

    public Bar(String data) {
        this.data = data;
        this.clientes = new ArrayList<>();
    }

    public void addCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void removeCliente(String cpf) {
        Cliente removido = null;

        for(Cliente cliente : this.clientes) {
            if(cliente.getCpf().equals(cpf)) {
                removido = cliente;
                break;
            }
        }

        this.clientes.remove(removido);
    }

    public List<Cliente> getClientes() {
        return new ArrayList<>(this.clientes);
    }

    public int getNumClientes() {
        return this.clientes.size();
    }

    public boolean estaNoBar(String cpf) {

        for(Cliente cliente : this.clientes) {
            if(cliente.getCpf() == cpf) return true;
        }

        return false;
    }

    public String percentualGenero() {
        int f = 0, m = 0;

        for(Cliente cliente : this.clientes) {
            if(cliente.getGenero() == 'F') f++;
            else m++;
        }

        return "Mulheres: " + (f / (f + m * 1.0) * 100) + "%\n" +
               "Homens: " + (m / (f + m * 1.0) * 100) + "%\n";
    }

    public String percentualSocio() {
        int s = 0, ns = 0;

        for(Cliente cliente : this.clientes) {
            if(cliente instanceof Socio) s++;
            else ns++;
        }

        return "Sócios: " + (s / (s + ns * 1.0) * 100) + "%\n" +
               "Não sócios: " + (ns / (s + ns * 1.0) * 100) + "%\n";
    }

    public void finalizarDia() {
        Escritor.escreve(this.data, new ArrayList<>(this.clientes));
    }

}
