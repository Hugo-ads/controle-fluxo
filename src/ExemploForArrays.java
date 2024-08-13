public class ExemploForArrays {
public static void main(String[] args) {
    String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

    //Em arrays o índice inicia em 0
    for (int x=0; x<alunos.length; x ++){

        System.out.println("O aluno no índice x=" + x + " é " + alunos[x]);
    
    }
}
}
