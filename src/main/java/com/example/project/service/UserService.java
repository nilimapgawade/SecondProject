package com.example.project.service;

import java.util.List;
import java.util.Map;

import com.example.project.Dto.CityDto;
import com.example.project.Dto.CountryDTO;
import com.example.project.Dto.LoginDto;
import com.example.project.Dto.RegisterDto;
import com.example.project.Dto.ResetpwdDto;
import com.example.project.Dto.StateDto;
import com.example.project.Dto.UserDto;
import com.example.project.entity.CountryEntity;

public interface UserService {

	List<CountryEntity> getAllCountry();

	List<StateDto> getState();

	List<CityDto> getCity();

	public String registerUser();

	public boolean getEmail(String email);

	public UserDto getUser(String email);

	public boolean registerUser(RegisterDto regDto);

	public UserDto getUser(LoginDto loginDto);

	public boolean resetPwd(ResetpwdDto pwdDto);

	public String getQuote(); // api-call

}
