package com.example.project.entity;

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
@Table(name="cities")
public class CityEntity {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "CITY_ID")
	    private Long cityId;

	    @Column(name = "CITY_NAME")
	    private String cityName;

	    //STATE_ID		INT			  FK one state has many cities
	    @ManyToOne
	    @JoinColumn(name = "STATE_ID", referencedColumnName = "STATE_ID")
	    private StateEntity state;

	    // Constructors, Getters, and Setters

	    public CityEntity() {
	        // Default constructor
	    }

		public Long getCityId() {
			return cityId;
		}

		public void setCityId(Long cityId) {
			this.cityId = cityId;
		}

		public String getCityName() {
			return cityName;
		}

		public void setCityName(String cityName) {
			this.cityName = cityName;
		}

		public StateEntity getState() {
			return state;
		}

		public void setState(StateEntity state) {
			this.state = state;
		}
	    
	    
	    

}
