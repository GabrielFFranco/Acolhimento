/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author gabri
 */
public class Conexao {
    
    public Connection getConnection() throws SQLException{
        
        String usuario = "root";
        String senha = "q1w2e3r4";
        String url = "jdbc:mysql://127.0.0.1:3306/acolhimento?serverTimezone=UTC";
        
        return DriverManager.getConnection(url, usuario, senha);
        
    }
    
}
