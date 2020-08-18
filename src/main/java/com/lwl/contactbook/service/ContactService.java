package com.lwl.contactbook.service;

import java.util.List;

import com.lwl.contactbook.domain.Contact;

public interface ContactService {

	public int addContact(Contact contact);

	public List<Contact> getAllContacts();

	public Contact getById(int cid);

	public Contact modifyContact(Contact contact);

	public List<Contact> search(String name);

	public boolean removeContact(int cid);

}
