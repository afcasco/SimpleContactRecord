package dev.afcasco.service;

import dev.afcasco.entity.Contact;

import java.util.List;

public interface ContactService {

    void save(Contact contact);

    List<Contact> getContacts();
}
