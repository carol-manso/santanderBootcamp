package ExercicioFinalJDBC;

import java.util.ArrayList;
import java.util.List;

public class QueryExecutions {
    public static void main(String[] args) {
        CursoDAO cursoDAO= new CursoDAO();
        //===========================SELECT ALL================================
        List<Curso> lista = new ArrayList<>();
        lista = cursoDAO.list();
        System.out.println(lista);
        //===========================SELECT CURSO DE ID ESPECÍFICO=============
        Curso curso = new Curso();
        curso = cursoDAO.getById(2);
        System.out.println(curso);

        //=========================CREATE==================================
        Curso cursoInserir = new Curso(0, "bootcamp Santander Fullstack", 125, true);
        cursoDAO.create(cursoInserir);

        //========================UPDATE=====================================
        Curso cursoAtualizar= new Curso (3, "Java Development", 155 , true);
        lista = cursoDAO.list();
        System.out.println(lista);
        cursoDAO.update(cursoAtualizar);
        lista = cursoDAO.list();
        System.out.println(lista);

        //=======================DELETE====================================
        lista = cursoDAO.list();
        System.out.println(lista);
        cursoDAO.delete(2);
        lista = cursoDAO.list();
        System.out.println(lista);
    }

}
