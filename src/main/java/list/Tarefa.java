package list;

public class Tarefa {
    private String nome;
    private String descricao;
    private boolean concluida;

    public  Tarefa(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
        this.concluida = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida() {
        this.concluida = true;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", concluida=" + concluida +
                '}';
    }
}
