package modelo;

import dao.AlunoDAO;
import java.sql.SQLException;
import java.util.ArrayList;

public class Aluno {
    int codigo;
    String nome, cpf, email, fone;

    public Aluno(String nome, String cpf, String email, String fone) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.fone = fone;
    }

    public Aluno() {
        this.codigo = 0;
        this.nome = null;
        this.cpf = null;
        this.email = null;
        this.fone = null;
    }

 
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }    
      
    public void cadastrar_aluno(Aluno aluno){
        // System.out.println("\n"+nome+"\n"+cpf+"\n"+email+"\n"+fone);
        AlunoDAO alunoDAO = new AlunoDAO();
        alunoDAO.cadastrar(aluno);
    }
    
    public ArrayList<Aluno> recuperar_aluno(){
        AlunoDAO alunodao = new AlunoDAO();
        return(alunodao.recuperar());
    }
    
    public void atualizar_aluno(Aluno aluno){
        AlunoDAO alunodao = new AlunoDAO();
        alunodao.atualizar(aluno);   
    }

    public void excluir_aluno(Aluno aluno) {
        AlunoDAO alunodao = new AlunoDAO();
        alunodao.apagar(aluno);
    }
}
