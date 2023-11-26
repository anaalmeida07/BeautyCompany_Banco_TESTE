package Model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Usuario;
import view.Login;

public class UsuarioDAO {
    private final Connection connection;

    public UsuarioDAO(Connection connection) {
        this.connection = connection;
    }

    public void insert(Usuario usuario) throws SQLException {
        String sql = "insert into usuario (usuario, senha) values (?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, usuario.getNome());
        statement.setString(2, usuario.getSenha());
        statement.execute();
    }

    public boolean existeNoBancoPorUsuarioESenha(Usuario usuario) throws SQLException {
        String sql = "select * from usuario where usuario = ? and senha = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, usuario.getNome());
        statement.setString(2, usuario.getSenha());
        ResultSet resultSet = statement.executeQuery();
        return resultSet.next();
    }

    public boolean update(Usuario usuario) throws SQLException {
        String sql = "update usuario set usuario = ?, senha = ? where id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, usuario.getNome());
        statement.setString(2, usuario.getSenha());
        statement.setInt(3, usuario.getId());
        return statement.executeUpdate() > 0;
    }

    public boolean delete(Usuario usuario) throws SQLException {
        String sql = "delete from usuario where id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, usuario.getId());
        return statement.executeUpdate() > 0;
    }

    public ArrayList<Usuario> selectAll() throws SQLException {
        String sql = "select * from usuario";
        PreparedStatement statement = connection.prepareStatement(sql);
    
        return pesquisa(statement);
    }

    private ArrayList<Usuario> pesquisa(PreparedStatement statement) throws SQLException {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        statement.execute();
        ResultSet resultSet1 = statement.getResultSet();
        
        
        while (resultSet1.next()) {
            int id= resultSet1.getInt("id");
            String usuario=resultSet1.getString("usuario"), senha=resultSet1.getString("senha");
            Usuario usuarioComDadosDoBanco = new Usuario(id, usuario, senha);
            usuarios.add(usuarioComDadosDoBanco);
        }
        return usuarios;
    }
    public Usuario selectPorId(Usuario usuario) throws SQLException{
         String sql = "select * from usuario where id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, usuario.getId());
        return pesquisa(statement).get(0);
         
        
        
    }


}
