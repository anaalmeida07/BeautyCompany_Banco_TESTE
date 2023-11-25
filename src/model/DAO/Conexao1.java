/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author crist
 */
public class Conexao1 {
    public Connection getConnection() throws SQLException{
        Connection conexao1 = DriverManager.getConnection("jdbc:postgresql://localhost:5432/usuarioBanco","postgres","postgres");
        return conexao1;
    }
}
