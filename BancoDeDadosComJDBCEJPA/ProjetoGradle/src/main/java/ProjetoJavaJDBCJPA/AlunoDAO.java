package ProjetoJavaJDBCJPA;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {
    //traz todos os alunos do banco de dados
    public List<Aluno> list(){
        List<Aluno> alunos= new ArrayList<>();

        try (Connection con = ConnectionJDBC.getConnection()){
           PreparedStatement prst= con.prepareStatement("SELECT * FROM aluno"); //preparamos o comando SQL
            ResultSet rs = prst.executeQuery(); //executamos o comando e mandamos o resultado dele para o resultset, que tem todos os valores das tuplas e colunas
            while(rs.next()){
                Aluno aluno= new Aluno(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getInt("idade"),
                        rs.getString("estado")
                );//novo objeto Aluno que pega os resultados do resultSet;

                alunos.add(aluno); //adicionando o aluno à nossa lista

            } //ponteiro primeiramente está em null; boolean-> true se exite próximo registro, false se não.


        }catch (Exception e){
            System.out.println("Algo deu errado :(");
            e.printStackTrace();

        }
        return alunos;
    }
    public Aluno getById(int id){
        Aluno aluno= new Aluno();
        try (Connection con = ConnectionJDBC.getConnection()){
            String sql = "SELECT * FROM aluno WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id); //1= primeira ? que aparece. Vamos colocar o id que recebemos lá.
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                aluno.setId(rs.getInt("id"));
                aluno.setNome(rs.getString("nome"));
                aluno.setIdade(rs.getInt("idade"));
                aluno.setEstado(rs.getString("estado"));

            }
        }catch(Exception e){
            System.out.println("Algo deu errado :( ");
            e.printStackTrace();
        }
        return aluno;
    }
    public void create (Aluno aluno){
        try(Connection con = ConnectionJDBC.getConnection()){
            String sql = "INSERT INTO aluno (nome, idade, estado) VALUES ( ? , ? , ?)";
            PreparedStatement stmt= con.prepareStatement(sql);
            stmt.setString(1, aluno.getNome());
            stmt.setInt(2, aluno.getIdade());
            stmt.setString(3, aluno.getEstado());
            int rowsAffected = stmt.executeUpdate();
            System.out.println(rowsAffected + " linha(s) afetadas");

        }catch (Exception e){
            System.out.println("Something went wrong :(");
            e.printStackTrace();

        }

    }
    public void delete(int id){

        try (Connection con = ConnectionJDBC.getConnection()){
            String sql= "DELETE FROM aluno WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            int rowsAffected = stmt.executeUpdate();
            System.out.println(rowsAffected + " linha(s) afetadas");

        }catch (Exception e){
            System.out.println("Something went wrong :(");
            e.printStackTrace();

        }
    }
    public void update(Aluno aluno){
        try (Connection con = ConnectionJDBC.getConnection()) {
            String sql = "UPDATE aluno SET nome = ? , idade = ? , estado = ? WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,aluno.getNome());
            stmt.setString(3,aluno.getEstado());
            stmt.setInt(2,aluno.getIdade());
            stmt.setInt(4,aluno.getId());
            int rowsAffected = stmt.executeUpdate();
            System.out.println(rowsAffected + " linha(s) afetadas");

        }catch (Exception e){
            System.out.println("Something went wrong :(");
            e.printStackTrace();

        }
    }
}
