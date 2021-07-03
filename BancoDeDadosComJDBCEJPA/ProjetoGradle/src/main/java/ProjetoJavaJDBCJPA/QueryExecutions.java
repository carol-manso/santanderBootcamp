package ProjetoJavaJDBCJPA;

import java.util.List;

public class QueryExecutions {
    public static void main(String[] args) {

        AlunoDAO alunoDAO = new AlunoDAO();
        /*============================SELECTS==========================================================*/
        List<Aluno> alunos= alunoDAO.list();
        System.out.println(alunos); //SELECT * FROM aluno;

        Aluno aluno= alunoDAO.getById(3);
        System.out.println(aluno); //SELECT * FROM aluno WHERE id = 3;

        /*===============================CREATE=======================================================*/

        aluno = new Aluno(0, "Gabriela", 15, "RO");
        //alunoDAO.create(aluno); //INSERT INTO aluno (nome, idade, estado) VALUES ();

        /*===============================DELETE=====================================================*/
        alunos= alunoDAO.list();
        System.out.println(alunos);
        alunoDAO.delete(7); //DELETE FROM aluno WHERE id = ;
        alunos= alunoDAO.list();
        System.out.println(alunos);

        /*================================UPDATE======================================================*/
        alunoDAO.list();
        System.out.println(alunos);
        Aluno alunoAtualizar = alunoDAO.getById(3); //buscar um aluno com um id específico no nosso BD.
        alunoAtualizar.setIdade(20);
        alunoDAO.update(alunoAtualizar);
        alunoDAO.list();
        System.out.println(alunos);

    }
}
