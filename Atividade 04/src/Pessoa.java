class Pessoa implements Cloneable {
    String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa: " + nome;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Objeto " + nome + " está sendo destruído...");
        super.finalize();
    }
}