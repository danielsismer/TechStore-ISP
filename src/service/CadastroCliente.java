package service;

import model.Cliente;

public interface CadastroCliente {
    void cadastrar(Cliente cliente);
    Cliente buscarPorEmail(String email);
}
