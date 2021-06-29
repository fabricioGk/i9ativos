/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.DriverManager;
import com.sun.jdi.connect.spi.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author fabri
 */
public class conexão {
    
    public Connection conectar() throws SQLException{
        
        Connection con = null;
        try {
            String url = "jdbc:mysql://localhost:3306/i9ativos?user=root&password=";
            con = (Connection) DriverManager.getConnection(url);
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/i9ativos?user=root&password=", "root", "" );
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Conexão DAO" + erro.getMessage());
        }
        return con;
        
        
    }
    
}
