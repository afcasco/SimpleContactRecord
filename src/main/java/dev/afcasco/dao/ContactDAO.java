package dev.afcasco.dao;

import dev.afcasco.entity.Contact;

import java.util.List;

public interface ContactDAO {
    void save(Contact contact);

    List<Contact> getContacts();
}

