package pobreAbastece.backEnd.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Augusto
 */
public class PostoDAO {

    List<Posto> lista = new ArrayList<>();

    public void adicionarPosto(Posto posto) {
        lista.add(posto);
        listarPostos();
    }

    private void listarPostos() {
        System.out.println("Os postos cadastrados são:");

        for (Posto posto : lista) {
            System.out.println("Nome: " + posto.getNome());
            System.out.println("Localzacao: " + posto.getLocalizacao());
        }
    }

    public String buscarPosto(String nome, String cnpj) {
        for (Posto posto : lista) {
            if (posto.getCnpj().equals(cnpj) && posto.getNome().equals(nome)) {
                return "O usuario: " + nome + " Existe na base de dados!";
            }
        }
        return "O usuario" + nome + "não existe no banco de dados";
    }

    public boolean deletarPosto(Posto postoDeletado) {
        for (Posto posto : lista) {
            if (posto.getCnpj().equals(postoDeletado.getCnpj()) && posto.getNome().equals(postoDeletado.getNome())) {
                System.out.println("Posto " + posto.getNome() + "foi deletado da nossa base!");
                lista.remove(postoDeletado);
                return true;
            }
        }
        System.out.println("O Usuario que você está tentando apagar não existe no banco.");
        return false;
    }

    public boolean loginPosto(String login, String senha) {
        for (Posto posto : lista) {
            if (posto.getLogin().equals(login) && posto.getSenha().equals(senha)) {
                return true;
            }
        }
        return false;
    }

    public void editPosto(Posto postoEdit) {
        int count = 0;
        for (Posto posto : lista) {
            if (posto.getCnpj().equals(postoEdit.getCnpj()) && posto.getNome().equals(postoEdit.getNome())) {
                lista.set(count, postoEdit);
            }
            count++;
        }
    }
}
