package com.freedompop.contact.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "contact")
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "contact_id")
	private int id;
	@Column(name = "name")
	@NotEmpty(message = "*Please provide your name")
	private String name;
	@Column(name = "last_name")
	@NotEmpty(message = "*Please provide your last name")
	private String lastName;
	@Column(name = "phone")
	private String phone;
	@Column(name = "email")
	private String email;
	@Column(name = "street")
	private String street;
	@Column(name = "internal_number")
	private String internalNumber;
	@Column(name = "external_number")
	private String externalNumber;
	@Column(name = "city")
	private String city;
	@Column(name = "state")
	private String state;
	@Column(name = "zip_code")
	private String zipCode;
	@Column(name = "active")
	private int active;

}