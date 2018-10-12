package com.freedompop.contact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freedompop.contact.model.Contact;
import com.freedompop.contact.repository.ContactRepository;

@Service("contactService")
public class ContactService {

	private ContactRepository contactRepository;

	@Autowired
	public ContactService(ContactRepository contactRepository) {
		this.contactRepository = contactRepository;
	}
	
	public Contact findContactByName(String name) {
		return contactRepository.findByName(name);
	}

	public List<Contact> findAllContacts() {
		return contactRepository.findAll();
	}
	
	public Contact findContactByEmail(String email) {
		return contactRepository.findByEmail(email);
	}

	public Contact saveContact(Contact contact) {
		contact.setActive(1);
		contactRepository.save(contact);
		return contact;
	}
	
	public void deleteById(Long id) {
		Contact contact = contactRepository.findById(id).orElse(null);
		if (contact != null) {
			contact.setActive(0);
			contactRepository.save(contact);
		}
	}

	public Contact findById(Long id) {
		return contactRepository.findById(id).orElse(null);
	}

}