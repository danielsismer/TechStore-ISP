import model.Cliente;
import service.CadastroCliente;
import service.Notificador;
import service.implement.ClienteService;

public class Main {
    public static void main(String[] args) {

        ClienteService clienteService = new ClienteService();

        Cliente novoCliente = new Cliente("João", "joao@email.com");

        CadastroCliente cadastro = clienteService;
        cadastro.cadastrar(novoCliente);

        Notificador notificador = clienteService;
        notificador.enviar(novoCliente.getEmail(), "Bem-vindo!");
    }
}