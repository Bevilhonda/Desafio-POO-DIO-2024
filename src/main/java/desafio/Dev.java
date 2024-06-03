package desafio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {

    private String nome;
    private final Set<Conteudo> conteudoEscritos = new LinkedHashSet<>(); // salva os inscritos na mesma ordem
    private final Set<Conteudo> conteudoConcluido = new LinkedHashSet<>();

    public void inscreverBootcamp(BootCamp bootCamp) {

    }

    public void progredir() {
    }

    public void calcularBootcamp() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoEscritos() {
        return conteudoEscritos;
    }

    public Set<Conteudo> getConteudoConcluido() {
        return conteudoConcluido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(
                conteudoEscritos, dev.conteudoEscritos) && Objects.equals(
                conteudoConcluido, dev.conteudoConcluido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudoEscritos, conteudoConcluido);
    }
}
