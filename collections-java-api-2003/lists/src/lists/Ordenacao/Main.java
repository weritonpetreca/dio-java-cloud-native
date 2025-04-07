package lists.Ordenacao;

public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Alice", 30, 1.65);
        ordenacaoPessoa.adicionarPessoa("Bob", 25, 1.80);
        ordenacaoPessoa.adicionarPessoa("Charlie", 35, 1.75);
        ordenacaoPessoa.adicionarPessoa("Diana", 28, 1.60);
        ordenacaoPessoa.adicionarPessoa("Eve", 22, 1.70);
        ordenacaoPessoa.adicionarPessoa("Frank", 40, 1.85);
        ordenacaoPessoa.adicionarPessoa("Grace", 29, 1.68);

        System.out.println("Lista de pessoas:");
        for (Pessoa pessoa : ordenacaoPessoa.listaDePessoas) {
            System.out.println(pessoa);
        }
        
        System.out.println("\nLista de pessoas ordenada por idade:");
        for (Pessoa pessoa : ordenacaoPessoa.ordenarPorIdade()) {
            System.out.println(pessoa);
        }

        System.out.println("\nLista de pessoas ordenada por altura:");
        for (Pessoa pessoa : ordenacaoPessoa.ordenarPorAltura()) {
            System.out.println(pessoa);
        }
    }
}
