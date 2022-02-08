import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {
    private String nome;
    private String matricula;
    List<Turma> listaTurma = new ArrayList<>();
    List<Orientador> listaOrientador = new ArrayList<>();

    public Aluno(String nome, String matricula, Orientador o){
        this.nome = nome;
        this.matricula = matricula;
        listaOrientador.add(o);
        if(o.listaAluno.size() < 3 && !o.listaAluno.contains(this)){
            o.adicionaAluno(this);
        }
    }

    public boolean adicionaTurma(Turma t){
        boolean sucesso = false;

        if(t != null && !listaTurma.contains(t)){
            listaTurma.add(t);
            sucesso = true;

            if(!t.listaAluno.contains(this)){
                t.adicionaAluno(this);
            }
        }
        return sucesso;
    }

    public boolean removeTurma(Turma t){
        boolean sucesso = false;

        if(!listaTurma.isEmpty() && listaTurma.contains(t)){
            listaTurma.remove(t);
            sucesso = true;

            if(t.listaAluno.contains(this)){
                t.removeAluno(this);
            }
        }
        return sucesso;
    }
    public boolean adicionaOrientador(Orientador o){
        boolean sucesso = false;

        if(o != null && !listaOrientador.contains(o) && listaOrientador.size() > 0 && listaOrientador.size() < 2){
            listaOrientador.add(o);
            sucesso = true;

            if(!o.listaAluno.contains(this) && o.listaAluno.size() < 3){
                o.adicionaAluno(this);
            }
        }
        return sucesso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(nome, aluno.nome) && Objects.equals(matricula, aluno.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, matricula);
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public List<Turma> getListaTurma() {
        return listaTurma;
    }

    public List<Orientador> getListaOrientador() {
        return listaOrientador;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }
    public void ImprimirAlunoTurma(){
        System.out.println();
        System.out.println(this.toString());

        for(Turma t : getListaTurma()){
            System.out.println("--" + t.toString() );
        }
    }

    public void ImprimirAlunoOrientador(){
        System.out.println();
        System.out.println(this.toString());

        for(Orientador o : getListaOrientador()){
            System.out.println("--" + o.toString());
        }
    }

}
