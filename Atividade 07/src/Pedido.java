import java.util.ArrayList;

class Pedido {
    static class ItemPedido {
        private String nome;
        private int quantidade;
        private double precoUnitario;

        public ItemPedido(String nome, int quantidade, double precoUnitario) {
            this.nome = nome;
            this.quantidade = quantidade;
            this.precoUnitario = precoUnitario;
        }

        public double subtotal() {
            return quantidade * precoUnitario;
        }

        public String getNome() {
            return nome;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public double getPrecoUnitario() {
            return precoUnitario;
        }
    }

    private ArrayList<ItemPedido> itens;

    public Pedido() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, int quantidade, double preco) {
        ItemPedido item = new ItemPedido(nome, quantidade, preco);
        itens.add(item);
    }

    public double valorTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.subtotal();
        }
        return total;
    }
}