package business;

import java.util.*;

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
            if(cliente.getCpf() == cpf) {
                removido = cliente;
                break;
            }
        }

        this.clientes.remove(removido);
    }

    public List<Cliente> getClientes() {
        return new ArrayList<>(clientes);
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

}
