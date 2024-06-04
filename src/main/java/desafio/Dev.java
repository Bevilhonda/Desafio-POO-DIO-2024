package desafio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private final String nome;
    private final String sobrenome;
    private final Set<Conteudo> conteudoEscritos = new LinkedHashSet<>(); // salva os inscritos na mesma ordem
    private final Set<Conteudo> conteudoConcluido = new LinkedHashSet<>();

    public Dev(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public void inscreverBootcamp(BootCamp bootCamp) {
        this.conteudoEscritos.addAll(bootCamp.getConteudos());
        bootCamp.getInscritos().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudoEscritos.stream().findFirst();

        if (conteudo.isPresent()){
            this.conteudoConcluido.add(conteudo.get());
            this.conteudoEscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteudo");
        }
    }

    public double calcularTotalXP() {
        return this.conteudoConcluido
                .stream()
                .mapToDouble(Conteudo::calcularXP).sum();
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
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
