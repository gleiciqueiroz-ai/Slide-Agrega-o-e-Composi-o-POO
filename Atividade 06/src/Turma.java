class Turma {
    private String codigo;
    private Professor professor;

    public Turma(String codigo) {
        this.codigo = codigo;
        this.professor = null;
    }

    public void setProfessor(Professor p) {
        this.professor = p;
    }

    public void resumo() {
        if (professor != null) {
            System.out.println("Código da Turma: " + codigo + ", Professor: " + professor.getNome());
        } else {
            System.out.println("Código da Turma: " + codigo + ", Professor: Nenhum");
        }
    }
}
