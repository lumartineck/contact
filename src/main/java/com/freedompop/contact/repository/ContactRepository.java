package com.freedompop.contact.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.freedompop.contact.model.Contact;

@Repository("contactRepository")
public interface ContactRepository extends JpaRepository<Contact, Long> {
	Contact findByEmail(String email);

	Contact findByName(String name);
}