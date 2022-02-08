public class TesteAlunoOrientador {

    public static void main(String[] args){

        Orientador o1 = new Orientador("Dory");
        Orientador o2 = new Orientador("Marllos");
        Orientador o3 = new Orientador("Sanderson");

        Aluno a1 = new Aluno("Gabriel", "20201010", o1);
        Aluno a2 = new Aluno("Rafael", "20201011", o2);
        Aluno a3 = new Aluno("Daniel", "20201002", o3);
        Aluno a4 = new Aluno("Hariel", "202012002", o3);

        a1.ImprimirAlunoOrientador();
        a1.adicionaOrientador(o2);
        a1.ImprimirAlunoOrientador();

        a2.adicionaOrientador(o1);
        a3.adicionaOrientador(o1);
        a4.adicionaOrientador(o1);

        o1.ImprimirOrientadorAluno();





    }
}
