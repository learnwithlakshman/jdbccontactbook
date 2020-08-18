package com.lwl.contactbook;

import com.lwl.contactbook.service.ContactService;
import com.lwl.contactbook.service.ContactServiceImpl;

public class Manager {
	public static void main(String[] args) {
		
		ContactService service = new ContactServiceImpl();
		while(true) {
			System.out.println("1. Add 2. Delete 3. Search 4. Edit 5. Update 6.Exit");
			//Logic
		}
	}
}
