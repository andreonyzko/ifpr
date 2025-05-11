package controle;

import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Aluno;

public class AlunoControle {
    
    public boolean cadastrar_aluno(String nome, String cpf, String email, String fone){
        if(nome.isEmpty() || cpf.isEmpty() || email.isEmpty() || fone.isEmpty()){
            return false;
        }
        else{
            Aluno aluno = new Aluno(nome, cpf, email, fone);
            aluno.cadastrar_aluno(aluno);
            return true;
        }
    }
    
    public ArrayList<Aluno> recuperar_aluno(){
            Aluno aluno= new Aluno();
            return(aluno.recuperar_aluno());
    }
    
    public void atualizar_aluno(String Codigo, String Nome, String Cpf, String Email, String Fone){
        Aluno aluno = new Aluno(Nome, Cpf, Email, Fone);
        aluno.setCodigo(Integer.parseInt(Codigo));
        aluno.atualizar_aluno(aluno);
    }
    public void excluir_aluno(String Codigo, String Nome, String Cpf, String Email, String Fone) {
       Aluno aluno = new Aluno(Nome, Cpf, Email, Fone);
       aluno.setCodigo(Integer.parseInt(Codigo));
       aluno.excluir_aluno(aluno);
    }
}
