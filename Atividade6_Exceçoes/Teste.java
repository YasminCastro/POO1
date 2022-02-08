package manipulacaoExcecoes;

public class Teste {
    public static void main(String[] args) {
        Orientador o1 = new Orientador("Dory");
        Orientador o2 = new Orientador("Eliezer");
        Orientador o3 = new Orientador("João");


        Estudante e1 = new Estudante(12, "Gabriel", o1);
        Estudante e2 = new Estudante(20, "Rafael", o1);
        Estudante e3 = new Estudante(40, "Daniel", o1);
        Estudante e4 = new Estudante(50, "Samuel", o1);
        Estudante e5 = new Estudante(70, "Hariel", o2);
        Estudante e6 = new Estudante(80, "Teste", o2);

        o1.addEstudante(e5);


    }
}
