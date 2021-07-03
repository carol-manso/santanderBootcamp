package ExercicioFinalJDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class CursoDAO {
    public List<Curso> list(){
        List<Curso> listaCursos = new ArrayList<Curso>();
        try (Connection con = Connections.getConnection()){
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM curso");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                Curso curso = new Curso(rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getInt("duracao_horas"),
                        rs.getBoolean("ativo"));
                listaCursos.add(curso);
            }


        }catch (Exception e){
            System.out.println("Sorry, something went wrong");
            e.printStackTrace();
        }
        return listaCursos;
    }
    public Curso getById(int id){
        Curso curso = new Curso();

        try (Connection con = Connections.getConnection()){
            String sql = "SELECT * FROM curso WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()) {
                curso.setId(rs.getInt("id"));
                curso.setNome(rs.getString("nome"));
                curso.setDuracao_horas(rs.getInt("duracao_horas"));
                curso.setAtivo(rs.getBoolean("ativo"));
            }


        }catch (Exception e){
            System.out.println("Sorry, something went wrong");
            e.printStackTrace();
        }

        return curso;
    }
    public void create (Curso curso){
        try(Connection con = Connections.getConnection()) {
            String sql = "INSERT INTO curso (nome, duracao_horas,ativo) VALUES (?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, curso.getNome());
            stmt.setInt(2, curso.getDuracao_horas());
            stmt.setBoolean(3, curso.isAtivo());
            int rowsInserted = stmt.executeUpdate();
            System.out.println(rowsInserted + " linha inseridas");
            if(rowsInserted != 0)
                System.out.println("Curso inserido com sucesso");
            else
                System.out.println("Não houve inserções");
        }catch (Exception e){
            System.out.println("Sorry, something went wrong");
            e.printStackTrace();
        }
    }
    public void update (Curso curso) {
        try (Connection con = Connections.getConnection()){
            String sql = "UPDATE curso SET nome = ?, duracao_horas = ?, ativo = ? WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(4, curso.getId());
            stmt.setString (1, curso.getNome());
            stmt.setInt(2, curso.getDuracao_horas());
            stmt.setBoolean(3, curso.isAtivo());
            int rowsUpdated = stmt.executeUpdate();
            System.out.println(rowsUpdated + " Linha atualizada");
            if (rowsUpdated != 0)
                System.out.println("Curso atualizado com sucesso");
            else
                System.out.println("Não houve atualizações");

        }catch (Exception e){
            System.out.println("Sorry, something went wrong");
            e.printStackTrace();
        }
    }
    public void delete (int id) {
        try (Connection con = Connections.getConnection()){
            String sql = "DELETE FROM curso WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            int rowsDeleted = stmt.executeUpdate();
            System.out.println(rowsDeleted + " linha deletada");
            if(rowsDeleted != 0)
                System.out.println("Curso deletado com sucesso");
            else
                System.out.println("Não houve deleções");
        }catch (Exception e){
            System.out.println("Sorry, something went wrong");
            e.printStackTrace();
        }
    }

}
