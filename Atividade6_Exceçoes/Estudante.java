package manipulacaoExcecoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Estudante {
    private int matricula;
    private String nome;
    List<Orientador> listaOrientador = new ArrayList<Orientador>();

    public Estudante(int matricula, String nome, Orientador o){
        this.matricula = matricula;
        this.nome = nome;
        if(o != null && o.listaEstudante.size() < 3){
            addOrientador(o);
        }else{
            throw new LimiteEstudantesException(this.nome);
        }


    }

    public void addOrientador(Orientador o){

        if(o != null && !listaOrientador.contains(o) && listaOrientador.size() < 2){
            listaOrientador.add(o);

            if (!o.listaEstudante.contains(this)) {
                o.listaEstudante.add(this);
            }
        }else {
            throw new LimiteOrientadorException(o.getNome(), this.nome);
        }

    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public List<Orientador> getListaOrientador() {
        return listaOrientador;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estudante estudante = (Estudante) o;
        return matricula == estudante.matricula && Objects.equals(nome, estudante.nome) && Objects.equals(listaOrientador, estudante.listaOrientador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula, nome, listaOrientador);
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                '}';
    }
}
