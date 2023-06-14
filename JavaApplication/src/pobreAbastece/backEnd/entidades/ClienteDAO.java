package pobreAbastece.backEnd.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Augusto
 */
public class ClienteDAO {

    List<Cliente> lista = new ArrayList<>();

    public ClienteDAO() {
    }
    
   
    public void adicionarCliente(Cliente cliente) {
        lista.add(cliente);
        listarClientes();
    }

    private void listarClientes() {
        System.out.println("Os clientes cadastrados são:");

        for (Cliente cliente : lista) {
            System.out.println("Nome: " + cliente.getNome() +" "+ cliente.getSobrenome());
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println("CEP: " + cliente.getLocalizacao());
            System.out.println("Usuário: " + cliente.getLogin());
            System.out.println("Senha: " + cliente.getSenha());
        }
    }

    public String buscarCliente(String login , String senha ) {
        for (Cliente cliente : lista) {
            if (cliente.getLogin().equals(login) && cliente.getSenha().equals(senha)) {
                return "O usuario: " + cliente.getNome() + " CPF: " + cliente.getCpf() + " Existe na base de dados!";
            }
        }
        return "O usuario com o login: " + login + " não existe no banco de dados";
    }

    public boolean deletarCliente(Cliente clienteDeletado) {
        for (Cliente cliente : lista) {
            if (cliente.getCpf().equals(clienteDeletado.getCpf()) && cliente.getNome().equals(clienteDeletado.getNome())) {
                System.out.println("Cliente " + cliente.getNome() + "foi deletado da nossa base!");
                lista.remove(clienteDeletado);
                return true;
            }
        }
        System.out.println("O Usuario que você está tentando apagar não existe no banco.");
        return false;
    }

    public boolean loginCliente(String login, String senha) {
         if(senha.equals("123") && login.equals("admin")){
             return true;
         }
        for (Cliente cliente : lista) {
            if (cliente.getLogin().equals(login) && cliente.getSenha().equals(senha)) {
                return true;
            }
        }
        return false;
    }
    
     public void editCliente(Cliente clienteEdit) {
        int count = 0;
        for (Cliente cliente : lista) {
            if (cliente.getCpf().equals(clienteEdit.getCpf()) && cliente.getNome().equals(clienteEdit.getNome())) {
                lista.set(count, clienteEdit);
            }
            count++;
        }
    }
}
