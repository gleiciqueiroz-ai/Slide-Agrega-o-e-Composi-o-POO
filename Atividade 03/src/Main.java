public class Main {
    public static void main(String[] args){
        
        int resultadoSoma = Calculadora.somar(5, 10);
        double resultadoPotencia = Calculadora.potencia(2, 3);

        System.out.println("Resultado da soma: " + resultadoSoma);
        System.out.println("Resultado da potência: " + resultadoPotencia);
    }
}