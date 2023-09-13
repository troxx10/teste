public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    // Construtor para inicializar o produto
    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    // Método para definir o nome do produto
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para definir o preço do produto
    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método para definir a quantidade em estoque do produto
    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    // Método para calcular o valor total em estoque do produto
    public double calcularValorTotalEmEstoque() {
        return preco * quantidadeEmEstoque;
    }

    // Método para obter informações do produto
    public String getInformacoesProduto() {
        return "Nome: " + nome + "\nPreço: R$" + preco + "\nQuantidade em Estoque: " + quantidadeEmEstoque;
    }

    public static void main(String[] args) {
        // Criando um objeto Produto
        Produto produto1 = new Produto("Camiseta", 29.99, 50);

        // Obtendo informações do produto
        String informacoes = produto1.getInformacoesProduto();
        System.out.println(informacoes);

        // Calculando o valor total em estoque do produto
        double valorTotal = produto1.calcularValorTotalEmEstoque();
        System.out.println("Valor Total em Estoque: R$" + valorTotal);
    }
}
