package com.example.project.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "countries")
public class CountryEntity {
		

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "COUNTRY_ID")
	    private int countryId;

	    @Column(name = "COUNTRY_NAME")
	    private String countryName;

	    // Constructors, Getters, and Setters

	    
	    
	    public CountryEntity() {
	        // Default constructor
	    }

		public int getCountryId() {
			return countryId;
		}

		public void setCountryId(int countryId) {
			this.countryId = countryId;
		}

		public String getCountryName() {
			return countryName;
		}

		public void setCountryName(String countryName) {
			this.countryName = countryName;
		}
		
		
		public CountryEntity(int countryId, String countryName) {
			super();
			this.countryId = countryId;
			this.countryName = countryName;
		}

		@Override
		public String toString() {
			return "CountryEntity [countryId=" + countryId + ", countryName=" + countryName + "]";
		}
		
		
}
