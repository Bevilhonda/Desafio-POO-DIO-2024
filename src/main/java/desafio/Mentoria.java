package desafio;

import java.time.LocalDate;

public class Mentoria {
    private final String titulo;
    private final String descricao;
    private final LocalDate data;

    public Mentoria(String descricao, String titulo, LocalDate data) {
        this.descricao = descricao;
        this.titulo = titulo;
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Mentoria: { " +
                "titulo = '" + titulo + '\'' +
                ", descricao = '" + descricao + '\'' +
                ", data = " + data +
                '}';
    }
}
