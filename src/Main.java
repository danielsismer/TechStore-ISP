import model.Cliente;
import service.CadastroCliente;
import service.ClienteService;
import service.implement.ClienteComumService;
import service.implement.ClienteVipService;
import view.ViewApp;

public class Main {

    public static void main(String[] args) {

        ViewApp viewApp = new ViewApp();
        ClienteService clienteService = new ClienteService();
        clienteService.auth(viewApp.save());

    }
}