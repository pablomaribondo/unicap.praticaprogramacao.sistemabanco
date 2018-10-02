package pratica.banco.negocio;

import pratica.banco.exceptions.ClienteExistenteException;
import pratica.banco.exceptions.ClienteInexistenteException;

public interface IRepositorioClientes {

    void insert(Cliente cliente) throws ClienteExistenteException;

    Cliente search(String cpf) throws ClienteInexistenteException;

    void update(Cliente cliente) throws ClienteInexistenteException;

    Cliente remove(Cliente cliente) throws ClienteInexistenteException;

    Cliente removeRoot() throws ClienteInexistenteException;

    Cliente exists(String cpf);
    
    void display();

}
