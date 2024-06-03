package desafio;

public class Curso extends Conteudo {

    private final int cargaHoraria;

    public Curso(String titulo, String descricao, int carga) {
        super(titulo, descricao); // Chama o construtor da superclasse
        this.cargaHoraria = carga;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso : { " +
                " titulo = '" + getTitulo() + '\'' +
                ", descricao = '" + getDescricao() + '\'' +
                ", cargaHoraria = " + cargaHoraria + " Horas." +
                '}';
    }

}
