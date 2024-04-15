package com.example.project.Dto;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.project.entity.CountryEntity;

public class ModelMapperConvertor {
	
	
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	public CountryDTO convertCountryToCountryDTO(CountryEntity country) {
		
		
		CountryDTO countryDTO = modelMapper.map(country, CountryDTO.class);
		
		return countryDTO;
	}

}
