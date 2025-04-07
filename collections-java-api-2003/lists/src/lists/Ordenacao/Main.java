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

        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(8);
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(7);
        ordenacaoNumeros.adicionarNumero(4);    

        System.out.println("\nNúmeros Inteiros:");
        for (int numero : ordenacaoNumeros.listaDeNumeros) {
            System.out.print(numero + " ");
        }

        System.out.println("\n\nNúmeros Inteiros Ordenados Ascendente:");
        for (int numero : ordenacaoNumeros.ordenarAscendente()) {
            System.out.print(numero + " ");
        }

        System.out.println("\n\nNúmeros Inteiros Ordenados Descendente:");
        for (int numero : ordenacaoNumeros.ordenarDescendente()) {
            System.out.print(numero + " ");
        }
    }
}
