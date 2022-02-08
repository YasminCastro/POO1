package manipulacaoExcecoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Orientador {
    private String nome;
    List<Estudante> listaEstudante = new ArrayList<Estudante>();

    public Orientador(String nome){
        this.nome = nome;
    }

    public void addEstudante(Estudante e){

        if(e != null && !listaEstudante.contains(e) && listaEstudante.size() < 3){
            listaEstudante.add(e);

            if(!e.listaOrientador.contains(this)){
                e.listaOrientador.add(this);
            }
        }else{
            throw new LimiteOrientadorException(this.nome, e.getNome());
        }
    }

    public List<Estudante> getListaEstudante() {
        return listaEstudante;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orientador that = (Orientador) o;
        return Objects.equals(nome, that.nome) && Objects.equals(listaEstudante, that.listaEstudante);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, listaEstudante);
    }

    @Override
    public String toString() {
        return "Orientador{" +
                "nome='" + nome + '\'' +
                '}';
    }

}
