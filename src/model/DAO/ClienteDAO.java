package Model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Cliente;





public class ClienteDAO {
    private final Connection connection;

    public ClienteDAO(Connection connection) {
        this.connection = connection;
    }
    
    public void insert(Cliente cliente) throws SQLException {
        String sql = "insert into cliente (nome, telefone) values (?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, cliente.getNome());
        statement.setString(2, cliente.getTelefone());
        statement.execute();
    }
    
     public boolean existeNoBancoPorNomeETelefone(Cliente cliente) throws SQLException {
        String sql = "select * from usuario where nome = ? and telefone = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, cliente.getNome());
        statement.setString(2, cliente.getTelefone());
        ResultSet resultSet = statement.executeQuery();
        return resultSet.next();
    }
     
     
      public ArrayList<Cliente> selectAll() throws SQLException {
        String sql = "select * from usuario";
        PreparedStatement statement = connection.prepareStatement(sql);
    
        return pesquisa(statement);
    }

    private ArrayList<Cliente> pesquisa(PreparedStatement statement) throws SQLException {
        ArrayList<Cliente> usuarios = new ArrayList<>();
        statement.execute();
        ResultSet resultSet1 = statement.getResultSet();
        
        
        while (resultSet1.next()) {
            String nome=resultSet1.getString("nome"), telefone=resultSet1.getString("telefone");
            Cliente usuarioComDadosDoBanco = new Cliente(nome, telefone);
            usuarios.add(usuarioComDadosDoBanco);
        }
        return usuarios;
    }
}
    
     