package desafio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private final LocalDate data;

    public Mentoria(String titulo, String descricao, LocalDate carga) {
        super(titulo, descricao); // Chama o construtor da superclasse
        this.data = carga;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Mentoria: { " +
                "Titulo = '" + getTitulo() + '\'' +
                ", Descrição = '" + getDescricao() + '\'' +
                ", Data = " + data +
                '}';
    }

}
