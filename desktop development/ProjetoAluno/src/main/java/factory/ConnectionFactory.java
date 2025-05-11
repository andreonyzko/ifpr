package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectionFactory {
    public Connection getConnection(){
        String endereco="jdbc:mysql://localhost:3306/dbaluno";
        
        try{
            return DriverManager.getConnection(endereco, "root", "");
        }
        catch(SQLException excecao){
            JOptionPane.showMessageDialog(null, "Erro DB"+excecao);
            throw new RuntimeException(excecao);
        }
    }
}
