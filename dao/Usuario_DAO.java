/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import bean.UsuarioPhsb;
import org.hibernate.Session;

/**
 *
 * @author
 */
public class Usuario_DAO extends DAO_Abstract {

    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.update(object);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.delete(object);
        session.getTransaction().commit();
    }

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuarioPhsb.class);
        criteria.add(Restrictions.eq("idusuario_phsb", id));
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista.get(0);
    }

//    public Usuario_DAO Login(String nome_phsb, String senha_phsb) {
//
//        session.beginTransaction();
//        Criteria criteria = session.createCriteria(UsuarioPhsb.class);
//        criteria.add(Restrictions.eq("nome_phsb", nome_phsb));
//        criteria.add(Restrictions.eq("senha_phsb", senha_phsb));
//        session.getTransaction().commit();
//return 
//    }
    @Override
    public List listALL() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuarioPhsb.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return  lista;
    }

//    public  List  login(String tab, String var) {
//        UsuarioPhsb usuario = null;
//
//        session.beginTransaction();
//        Criteria criteria = session.createCriteria(UsuarioPhsb.class);
//        criteria.add(Restrictions.eq(tab, var));
//       
//
//       List Lista = criteria.list(); //   só deve haver um usuário com essas credenciais
//
//        session.getTransaction().commit();
//
//        return Lista;
//    }
    public List login(String nome_phsb, String senha_phsb) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuarioPhsb.class);
        criteria.add(Restrictions.eq(nome_phsb, senha_phsb));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;

    }

    public List listNome(String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuarioPhsb.class);
        criteria.add(Restrictions.like("nome", "%" + nome + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;

    }

    public List listCpf(String cpf) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuarioPhsb.class);
        criteria.add(Restrictions.like("cpf", "%" + cpf + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;

    }

    public List listNomeCpf(String nome, String cpf) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuarioPhsb.class);
        criteria.add(Restrictions.like("nome", "%" + nome + "%"));
        criteria.add(Restrictions.like("cpf", "%" + cpf + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;

    }

}
