package ExercicioFinalJDBC;

public class Curso {
    private int id;
    private String nome;
    private int duracao_horas;
    private boolean ativo;

    public Curso(int id, String nome, int duracao_horas, boolean ativo) {
        this.id = id;
        this.nome = nome;
        this.duracao_horas = duracao_horas;
        this.ativo = ativo;
    }

    public Curso() {
        this.id = this.duracao_horas = 0;
        this.nome= "";
        this.ativo = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao_horas() {
        return duracao_horas;
    }

    public void setDuracao_horas(int duracao_horas) {
        this.duracao_horas = duracao_horas;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Curso " + nome +
                " de id = "+  id +
                ", possui duracao de " + duracao_horas + " horas"+
                ((ativo) ? " e está ativo" : " e não está ativo") + "----";
    }
}
