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

/**
 *
 * @author 
 */
public class Usuario_DAO extends DAO_Abstract{

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
       session.delete( object);
       session.getTransaction().commit();
    }

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Usuario_DAO.class);
        criteria.add(Restrictions.eq("id_usuario_phsb", id));
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista.get(0);
    }

   
    
    
    public Usuario_DAO Login(String apelidophsb, String senhaphsb) {
    try {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Usuario_DAO.class);
        criteria.add(Restrictions.eq("apelidophsb", apelidophsb));
        criteria.add(Restrictions.eq("senhaphsb", senhaphsb));

        Usuario_DAO usuario_DAO = (Usuario_DAO) criteria.uniqueResult();

        session.getTransaction().commit();

        return usuario_DAO;
    } catch (Exception e) {
        e.printStackTrace();
    }

    return null;
}

    @Override
    public List listALL() {
        session.beginTransaction();
       Criteria criteria = session.createCriteria(Usuario_DAO.class);
       List lista = criteria.list();
       session.getTransaction().commit();
       return (ArrayList) lista;
    }
    
}