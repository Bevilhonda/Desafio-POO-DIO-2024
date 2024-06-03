package desafio;

public class Curso {
    private final String titulo;
    private final String descricao;
    private final int cargaHoraria;

    public Curso(String titulo, String descricao, int cargaHoraria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso : { " +
                " titulo = '" + titulo + '\'' +
                ", descricao = '" + descricao + '\'' +
                ", cargaHoraria = " + cargaHoraria + " Horas."+
                '}';
    }
}
