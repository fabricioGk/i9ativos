package dao;

import java.sql.PreparedStatement;
import com.mysql.cj.protocol.Resultset;
import entities.cliente;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author fabri
 */
public class clientedao {

    Connection con;

    public Resultset autenticarcliente(cliente objcliente) throws SQLException {

        con = (Connection) new conexão().conectar();

        try {
            String sql = "select * from cliente where nome_cliente = ? and senha = ?";

            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setString(1, objcliente.getUsuario());
            psmt.setString(2, objcliente.getSenha());

            Resultset rs = (Resultset) psmt.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Cliente" + erro);
            return null;
        }

    }
}
