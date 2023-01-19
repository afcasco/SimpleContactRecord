package dev.afcasco.service;


import dev.afcasco.dao.ContactDAO;
import dev.afcasco.entity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
public class ContactServiceImp implements ContactService {

    @Autowired
    private ContactDAO contactDAO;


    @Override
    @Transactional
    public void save(Contact contact) {
        contactDAO.save(contact);
    }

    @Override
    @Transactional
    public List<Contact> getContacts() {
        return contactDAO.getContacts();
    }
}
