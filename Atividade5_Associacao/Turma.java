import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Turma {
    private String codigo;
    private String nome;
    List<Aluno> listaAluno = new ArrayList<>();

    public Turma(String codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }

    public boolean adicionaAluno(Aluno a){
        boolean sucesso = false;

        if(a != null && !listaAluno.contains(a)){
            listaAluno.add(a);
            sucesso = true;

            if(!a.listaTurma.contains(this)){
                a.adicionaTurma(this);
            }
        }
        return sucesso;
    }
    public boolean removeAluno(Aluno a){
        boolean sucesso = false;

        if(a != null && listaAluno.contains(a)){
            listaAluno.remove(a);
            sucesso = true;

            if(a.listaTurma.contains(this)){
                a.removeTurma(this);
            }

        }
        return sucesso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Turma turma = (Turma) o;
        return Objects.equals(codigo, turma.codigo) && Objects.equals(nome, turma.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nome);
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public List<Aluno> getListaAluno() {
        return listaAluno;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

    public void ImprimirTurmaAluno(){
        System.out.println();
        System.out.println(this.toString());

        for(Aluno a : getListaAluno()){
            System.out.println("--" + a.toString());
        }

    }
}
