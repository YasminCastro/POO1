import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Orientador {
    private String nome;
    List<Aluno> listaAluno = new ArrayList<>();

    public Orientador(String nome){
        this.nome = nome;
    }

    public boolean adicionaAluno(Aluno a){
        boolean sucesso = false;

        if(a != null && !listaAluno.contains(a) && listaAluno.size() < 3){
            listaAluno.add(a);
            sucesso = true;

            if(!a.listaOrientador.contains(this) && a.listaOrientador.size() < 2 && a.listaOrientador.size() > 0){
                a.adicionaOrientador(this);
            }
        }
        return sucesso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orientador that = (Orientador) o;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    public String getNome() {
        return nome;
    }

    public List<Aluno> getListaAluno() {
        return listaAluno;
    }

    @Override
    public String toString() {
        return "Orientador{" +
                "nome='" + nome + '\'' +
                '}';
    }
    public void ImprimirOrientadorAluno(){
        System.out.println();
        System.out.println(this.toString());

        for(Aluno a : getListaAluno()){
            System.out.println("--" + a.toString());
        }
    }
}
