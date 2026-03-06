package service;

import model.Cliente;
import service.CadastroCliente;
import service.implement.ClienteComumService;
import service.implement.ClienteVipService;

import java.util.HashMap;
import java.util.Map;

public class ClienteService {

    private Map<String, CadastroCliente> servicos = new HashMap<>();

    public void gerenciar(Cliente cliente, CadastroCliente cadastroCliente){
        cadastroCliente.cadastrar(cliente);
    }

    public void auth(Cliente cliente){

        CadastroCliente cadastroCliente = servicos.get(cliente.getTipo().toUpperCase());

        if(cadastroCliente != null){
            gerenciar(cliente, cadastroCliente);
        }

    }
}
