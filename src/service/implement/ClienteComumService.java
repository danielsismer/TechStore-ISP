package service.implement;

import model.Cliente;
import infra.repository.ClienteRepository;
import service.CadastroCliente;

import java.sql.SQLException;

public class ClienteComumService implements CadastroCliente {

    ClienteRepository clienteRepository = new ClienteRepository();

    @Override
    public void cadastrar(Cliente cliente) {
        cliente.setTipo("COMUM");
        clienteRepository.save(cliente);
        System.out.println("COMUM: Cadastrando " + cliente.getNome());
    }

    @Override
    public Cliente buscarPorEmail(String email) throws SQLException {
        return clienteRepository.find(email);
    }
}
