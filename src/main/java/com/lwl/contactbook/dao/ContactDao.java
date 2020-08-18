package com.lwl.contactbook.dao;

import java.util.List;

import com.lwl.contactbook.domain.Contact;

public interface ContactDao {

	public int insertContact(Contact contact);

	public List<Contact> selectAllContacts();

	public Contact selectById(int cid);

	public Contact updateContact(Contact contact);

	public List<Contact> search(String name);

	public boolean deleteContact(int cid);
}
