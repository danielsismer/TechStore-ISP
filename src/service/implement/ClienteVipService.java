package service.implement;

import infra.repository.ClienteRepository;
import model.Cliente;
import service.CadastroCliente;
import service.Notificador;
import service.ProgramaFidelidade;

import java.sql.SQLException;
import java.sql.SQLOutput;

public class ClienteVipService implements CadastroCliente, Notificador, ProgramaFidelidade {

    ClienteRepository clienteRepository = new ClienteRepository();

    @Override
    public void cadastrar(Cliente cliente) {
        cliente.setTipo("VIP");
        clienteRepository.save(cliente);
        System.out.println("VIP: Cadastrando " + cliente.getNome());
    }

    @Override
    public Cliente buscarPorEmail(String email) throws SQLException {
        return clienteRepository.find(email);
    }

    @Override
    public void enviar(String email, String mensagem) {
        System.out.println("Olá, " + email + "!!!" + mensagem);
    }

    @Override
    public void aplicarDesconto(String email, double percentual) {
        System.out.println("Desconto de " + percentual + " aplicado ao usuário: " + email);
    }
}
