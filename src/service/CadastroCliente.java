package service;

import model.Cliente;

import java.sql.SQLException;

public interface CadastroCliente {
    void cadastrar(Cliente cliente);
    Cliente buscarPorEmail(String email) throws SQLException;
}
