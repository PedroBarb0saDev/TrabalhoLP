/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import bean.VendaPhsb;
import java.util.Date;

/**
 *
 *
 */
public class Venda_DAO extends DAO_Abstract {

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
        Criteria criteria = session.createCriteria(VendaPhsb.class);
        criteria.add(Restrictions.eq("idvenda_Phsb", id));
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista.get(0);
    }

    @Override
    public List listALL() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Venda_DAO.class);
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista;
    }

    public List listValorTotal(int valorTotal) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VendaPhsb.class);
        criteria.add(Restrictions.like("ValorTotal", "%" + valorTotal + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;

    }

    public List listData(Date data) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VendaPhsb.class);
        criteria.add(Restrictions.like("cpf", "%" + data + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;

    }

    public List listValorTotalData(int valorTotal, Date data) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VendaPhsb.class);
        criteria.add(Restrictions.like("valorTotal", "%" + valorTotal + "%"));
        criteria.add(Restrictions.like("data", "%" + data + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;

    }

}
