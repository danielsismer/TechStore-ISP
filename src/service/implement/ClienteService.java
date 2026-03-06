package service.implement;

import model.Cliente;
import service.CadastroCliente;
import service.Notificador;
import service.ProgramaFidelidade;

public class ClienteService implements CadastroCliente, Notificador, ProgramaFidelidade {

    @Override
    public void cadastrar(Cliente cliente) {
        System.out.println("Persistindo cliente no banco: " + cliente.getNome());
    }

    @Override
    public Cliente buscarPorEmail(String email) {
        return new Cliente("Exemplo", email);
    }

    @Override
    public void enviar(String email, String mensagem) {
        System.out.println("Enviando e-mail para " + email);
    }

    @Override
    public void aplicarDesconto(String email, double percentual) {
        System.out.println("Desconto de " + percentual + "% aplicado.");
    }
}