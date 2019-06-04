
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author desenvolvimento3
 */

public class ExcluirAluno {
  
    public static void main(String[] args) {
        try {
            SessionFactory fabrica = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
            Session sessao = fabrica.openSession();
            Aluno aluno = new Aluno();
            
            aluno.setAluCodigo(4);
            
            Transaction tr_aluno = sessao.beginTransaction();
            sessao.delete(aluno);
            tr_aluno.commit();
            sessao.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
}
