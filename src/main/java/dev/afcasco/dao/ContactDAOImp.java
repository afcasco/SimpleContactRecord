package dev.afcasco.dao;

import dev.afcasco.entity.Contact;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ContactDAOImp implements ContactDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Contact contact) {
        Session session = sessionFactory.getCurrentSession();
        session.save(contact);
    }

    @Override
    public List<Contact> getContacts() {
        Session session = sessionFactory.getCurrentSession();
        Query<Contact> query = session.createQuery("from Contact order by firstName", Contact.class);
        return query.getResultList();
    }
}
