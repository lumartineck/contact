package com.freedompop.contact.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.freedompop.contact.model.Contact;
import com.freedompop.contact.service.ContactService;

@RestController
class RestContactController {

	private final ContactService contactService;

	RestContactController(ContactService contactService) {
		this.contactService = contactService;
	}

	@GetMapping("/contacts")
	List<Contact> all() {
		return contactService.findAllContacts();
	}

	@PostMapping("/contacts")
	Contact newContact(@RequestBody Contact newContact) {
		return contactService.saveContact(newContact);
	}

	@GetMapping("/contacts/{id}")
	Contact one(@PathVariable Long id) {
		return contactService.findById(id);
	}

	@PutMapping("/contacts/{id}")
	Contact replaceContact(@RequestBody Contact newContact, @PathVariable Long id) {
		Contact contact = contactService.findById(id);
		if (contact != null) {
			contact.setName(newContact.getName());
			return contactService.saveContact(contact);
		} else {
			newContact.setId(id.intValue());
			return contactService.saveContact(newContact);
		}
	}

	@DeleteMapping("/contacts/{id}")
	void deleteContact(@PathVariable Long id) {
		contactService.deleteById(id);
	}
}
