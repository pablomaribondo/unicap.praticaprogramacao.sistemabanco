package pratica.banco.negocio;

import pratica.banco.exceptions.SaldoInsuficienteException;

public class ContaSimples extends ContaAbstrata {

    public ContaSimples(String numero, Cliente cliente) {
        super(numero, cliente);
    }

    public ContaSimples(String numero, double saldo, Cliente cliente) {
        super(numero, saldo, cliente);
    }

    public void debitar(double valor) throws SaldoInsuficienteException {
        double saldo = getSaldo();
        if (valor <= saldo) {
            setSaldo(saldo - valor);
        } else {
            throw new SaldoInsuficienteException(getNumero(), getSaldo());
        }
    }

}
