public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.emitirSom();
        
        Pessoa p1 = new Pessoa("123.456.789-00");
        p1.mostrarCPF();

        System.out.println("A classe Animal é final (não pode ser herdada).");
        System.out.println("O atributo CPF é final (não pode ser alterado).");
    }
}