public class TesteCliente {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nome = "Rhaniel Farias";
        cliente.cpf = "111.111.111-11";
        cliente.profissao = "Programador";
        System.out.println(cliente.nome);

        Conta conta = new Conta();
        conta.depositar(50);
        System.out.println(conta.nomeDoTitular);
        System.out.println(conta.saldo);
    }
}
