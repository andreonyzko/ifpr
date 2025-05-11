package dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Aluno;

public class AlunoDAO {
    private Connection connection;
    
    public AlunoDAO(){
        this.connection = new ConnectionFactory().getConnection();
        System.out.println("Conexão aberta!");
    }
    
    public void cadastrar(Aluno aluno){
        String consulta = "INSERT INTO tbaluno(nome_aluno, cpf_aluno, email_aluno, fone_aluno)VALUES(?, ?, ?, ?)";
        try{
            PreparedStatement stmt = connection.prepareStatement(consulta);
            stmt.setString(1,aluno.getNome());
            stmt.setString(2, aluno.getCpf());
            stmt.setString(3, aluno.getEmail());
            stmt.setString(4, aluno.getFone());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null,"Cadastro realizado com Sucesso", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException excecao){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar "+excecao);
            throw new RuntimeException(excecao);
        }
    }
    
    public ArrayList<Aluno> recuperar(){
        ArrayList<Aluno> lista_alunos = new ArrayList<Aluno>();
        String consulta = "select * from tbaluno";
        ResultSet rs=null;
        
        try{
            PreparedStatement stmt = connection.prepareStatement(consulta);
            rs= stmt.executeQuery();
            while(rs.next()){
                Aluno aluno = new Aluno();
                aluno.setCodigo(rs.getInt("cod_aluno"));
                aluno.setNome(rs.getString("nome_aluno"));
                aluno.setCpf(rs.getString("cpf_aluno"));
                aluno.setEmail(rs.getString("email_aluno"));
                aluno.setFone(rs.getString("fone_aluno"));
                lista_alunos.add(aluno);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao recuperar dados "+e);
            throw new RuntimeException(e);
        }
        
        return lista_alunos;
    }
    
    public void atualizar(Aluno aluno){
        String consulta = "update tbaluno set nome_aluno = ?, cpf_aluno = ?, email_aluno = ?, fone_aluno = ? WHERE cod_aluno = ?";
        try{
            PreparedStatement stmt = connection.prepareStatement(consulta);
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getCpf());
            stmt.setString(3, aluno.getEmail());
            stmt.setString(4, aluno.getFone());
            stmt.setLong(5, aluno.getCodigo());
            stmt.executeUpdate();
            stmt.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao atualizar dados "+e);
            throw new RuntimeException(e);
        }
    }
    
    public void apagar(Aluno aluno){
        String consulta="delete from tbAluno WHERE cod_aluno=?";
        try{
            PreparedStatement stmt = connection.prepareStatement(consulta);
            stmt.setLong(1, aluno.getCodigo());
            stmt.executeUpdate();
            stmt.close();
        }
        catch(SQLException e){
             JOptionPane.showMessageDialog(null, "Erro ao apagar dados "+e);
             throw new RuntimeException(e);
        }
    }
}
