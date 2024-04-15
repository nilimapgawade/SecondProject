package com.example.project.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class UserDtlsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	private Long userId;

	@Column(name = "NAME")
	private String name;

	@Column(name = "EMAIL", unique = true)
	private String email;

	@Column(name = "PWD")
	private String password;

	@Column(name = "PHNO")
	private int phoneNumber;

	@Column(name = "PWD_UPDATED", columnDefinition = "VARCHAR default 'no'")
	private String passwordUpdated;

	@CreationTimestamp
	@Column(name = "CREATED_DATE")
	private LocalDate createdDate;

	@CreationTimestamp
	@Column(name = "UPDATED_DATE")
	private LocalDate updatedDate;

	
	
	@ManyToOne
	@JoinColumn(name = "COUNTRY_ID")
	private CountryEntity country;

	@ManyToOne
	@JoinColumn(name = "STATE_ID")
	private StateEntity state;

	@ManyToOne
	@JoinColumn(name = "CITY_ID")
	private CityEntity city;

	// Constructors, Getters, and Setters

	public UserDtlsEntity() {
		// Default constructor
	}

	// Constructors

	// Getters and Setters
}
