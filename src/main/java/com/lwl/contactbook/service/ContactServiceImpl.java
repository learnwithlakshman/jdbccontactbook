package com.lwl.contactbook.service;

import java.util.List;

import com.lwl.contactbook.dao.ContactDao;
import com.lwl.contactbook.dao.ContactDaoImp;
import com.lwl.contactbook.domain.Contact;

public class ContactServiceImpl implements ContactService {
	
	private ContactDao contactDao = new ContactDaoImp();
	
	public int addContact(Contact contact) {
		int cid;
		if(contact!=null) {
			 cid = contactDao.insertContact(contact);
		}else {
			throw new IllegalArgumentException("Contact Object can't null");
		}
		return cid;
	}

	public List<Contact> getAllContacts() {
		// TODO Auto-generated method stub
		return null;
	}

	public Contact getById(int cid) {
		// TODO Auto-generated method stub
		return null;
	}

	public Contact modifyContact(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Contact> search(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean removeContact(int cid) {
		// TODO Auto-generated method stub
		return false;
	}

}
