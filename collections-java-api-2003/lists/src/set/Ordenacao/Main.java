package set.Ordenacao;

public class Main {
    public static void main(String[] args) {
        
        CadastroProduto cadastroProduto = new CadastroProduto();

        cadastroProduto.adicionarProduto(1, "Produto A", 20.0, 5);
        cadastroProduto.adicionarProduto(1, "Produto Z", 10.0, 10);
        cadastroProduto.adicionarProduto(2, "Produto B", 90.0, 3);
        cadastroProduto.adicionarProduto(3, "Produto C", 30.0, 2);
        cadastroProduto.adicionarProduto(4, "Produto D", 50.0, 1);

        System.out.println(cadastroProduto.produtoSet);

        System.out.println(cadastroProduto.exibirProdutosPorNome());
        System.out.println(cadastroProduto.exibirProdutosPorPreco());
        
        
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
    
        gerenciadorAlunos.adicionarAluno(1, "Aluno A", 8.5);
        gerenciadorAlunos.adicionarAluno(2, "Aluno B", 7.0);
        gerenciadorAlunos.adicionarAluno(2, "Aluno B", 7.0);
        gerenciadorAlunos.adicionarAluno(3, "Aluno C", 9.0);
        gerenciadorAlunos.adicionarAluno(4, "Aluno D", 6.5);
        gerenciadorAlunos.adicionarAluno(5, "Aluno E", 8.0);
        gerenciadorAlunos.adicionarAluno(6, "Aluno F", 7.5);

        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());

        gerenciadorAlunos.removerAluno(2);
        gerenciadorAlunos.removerAluno(7); // Tentativa de remover aluno que não existe

        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());

        gerenciadorAlunos.exibirAlunos();
    }


}
