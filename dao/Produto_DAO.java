/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import bean.ProdutoPhsb;

/**
 *
 *
 */
public class Produto_DAO extends DAO_Abstract {

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
        Criteria criteria = session.createCriteria(ProdutoPhsb.class);
        criteria.add(Restrictions.eq("idproduto_phsb", id));
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista.get(0);
    }

    @Override
    public List listALL() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ProdutoPhsb.class);
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista;
    }

    public List listNome(String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ProdutoPhsb.class);
        criteria.add(Restrictions.like("nome_Phsb", "%" + nome + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;

    }

    public List listValor(String valor) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ProdutoPhsb.class);
        criteria.add(Restrictions.like("valorPhsb", "%" + valor + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;

    }

    public List listNomeValor(String nome, String valor) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ProdutoPhsb.class);
        criteria.add(Restrictions.like("nome", "%" + nome + "%"));
        criteria.add(Restrictions.like("valor", "%" + valor + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

}
