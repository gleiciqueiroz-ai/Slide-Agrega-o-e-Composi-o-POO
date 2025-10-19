public class Main {
    public static void main(String[] args) {
        // Criar um professor
        Professor prof1 = new Professor("João Silva");

        // Criar uma turma
        Turma turma = new Turma("TURMA001");

        // Associar o professor à turma
        turma.setProfessor(prof1);

        // Exibir resumo
        turma.resumo();

        // Criar outro professor
        Professor prof2 = new Professor("Maria Oliveira");

        // Trocar o professor da turma
        turma.setProfessor(prof2);

        // Exibir resumo novamente
        turma.resumo();
    }
}