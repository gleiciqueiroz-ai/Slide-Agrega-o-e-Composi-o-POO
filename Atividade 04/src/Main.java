public class Main {
    public static void main(String[] args) {
        try {
            Pessoa p1 = new Pessoa("Maria");
            Pessoa p2 = (Pessoa) p1.clone();

            System.out.println("Original: " + p1);
            System.out.println("Clone: " + p2);

            p1 = null;
            p2 = null;
            System.gc();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}