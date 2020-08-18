package com.lwl.contactbook.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.List;

import com.lwl.contactbook.domain.Contact;

public class ContactDaoImp implements ContactDao {
	
	private ConnectionUtil util = ConnectionUtil.getInstance();
	private static final String ADD_CONTACT = "insert into contact(name,email,mobile,dob) values (?,?,?,?)";

	public int insertContact(Contact contact) {
		
		Connection con = null;
		PreparedStatement pst = null;
		int count=0;
		try {
			con = util.getConnection();
			pst = con.prepareStatement(ADD_CONTACT);
			pst.setString(1, contact.getName());
			pst.setString(2, contact.getEmail());
			pst.setString(3, contact.getMobile());
			pst.setDate(4, Date.valueOf(contact.getDob()));
			count = pst.executeUpdate();
			
		}catch (Exception e) {
			System.out.println("While inserting data :"+e);
		}finally {
			util.close(pst, con);
		}
		
		return count;
	}

	public List<Contact> selectAllContacts() {
		// TODO Auto-generated method stub
		return null;
	}

	public Contact selectById(int cid) {
		// TODO Auto-generated method stub
		return null;
	}

	public Contact updateContact(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Contact> search(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteContact(int cid) {
		// TODO Auto-generated method stub
		return false;
	}

}
